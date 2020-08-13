package com.lt.gzj.sp.service.stream8001provider.controller;

import com.lt.gzj.sp.service.stream8001provider.Client.ISclient;
import com.lt.gzj.sp.service.stream8001provider.service.IMessageProvider;
import com.weconex.njcc.sp.client.yunCode.util.QrCode;
import com.weconex.njcc.sp.common.security.HexUtil;
import com.weconex.qrcode.publish.kmc.sm2.SM2KeyPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.stream8001provider.controller
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/22 14:45
 * @Version: 1.0
 */
@RestController
public class TestController {

    @Resource
    IMessageProvider messageProviderImpl;

    @Autowired
    ISclient iSclient;
    @GetMapping("/v1/stream/sendmsg")
    public String sendMsg(String msg){
        String str = messageProviderImpl.sendMessage(msg);
        return str;
    }


    @GetMapping("/v1/test/qrcode")
    public void testImage(){

        SM2KeyPair sm2 = new SM2KeyPair();
        sm2.generateKeyPair();

        String publicHexKey = sm2.getPublicKeyHex();
        byte[] publicKey = sm2.getPublicKey();
        byte[] privateKey = sm2.getPrivateKey();

        System.out.println("publicHexKey:"+publicHexKey);
        System.out.println("publicKey:"+new String(publicKey));
        System.out.println("privateKey:"+new String(privateKey));

        Map reqMap = new HashMap();
//        reqMap.put("appId","2019011810021");
//        reqMap.put("method","njcc.sp.member.busqrcode.download");
//        reqMap.put("format","JSON");
//        reqMap.put("charset","utf-8");
//        reqMap.put("signType","MD5");
//        reqMap.put("sign","F82C36F086B90432B62D70AA5417E777");
//        reqMap.put("timestamp","2014-07-24 03:07:50");
//        reqMap.put("version","1.0");
//        reqMap.put("memberCode","30000001155");
//        reqMap.put("payAccountNo","3010000000581005");
//        reqMap.put("memberType","01");
//        reqMap.put("cardNo","6060000071387001");
        reqMap.put("appId","2019011810021");
        reqMap.put("method","njcc.sp.member.busqrcode.download");
        reqMap.put("format","JSON");
        reqMap.put("charset","utf-8");
        reqMap.put("signType","MD5");
        reqMap.put("sign","F82C36F086B90432B62D70AA5417E777");
        reqMap.put("timestamp","2014-07-24 03:07:50");
        reqMap.put("version","1.0");
        reqMap.put("memberCode","30000001155");
        reqMap.put("payAccountNo","3010000000581005");
        reqMap.put("memberType","01");
        reqMap.put("cardNo","6060000000316001");
        reqMap.put("publicKey",publicHexKey);
        Map map = iSclient.queryQrCode(reqMap);
        Map respBody = (Map) map.get("respBody");
        byte[] content = org.apache.commons.codec.binary.Base64.decodeBase64(String.valueOf(respBody.get("staticInstData")));
        byte[] qrcodeSign = new byte[content.length + 4];
        System.arraycopy(content, 0, qrcodeSign, 0, content.length);
        Calendar calendar = Calendar.getInstance();
        int time = (int) (calendar.getTime().getTime() / 1000);
        byte[] createTime = new byte[4];
        for (int i = createTime.length - 1; i >= 0; i--) {
            createTime[i] = (byte) (time & 0xFF);
            time >>= 8;
        }

        System.arraycopy(createTime, 0, qrcodeSign, content.length, 4);
        byte[] qrcode = new byte[qrcodeSign.length + 65];
        System.arraycopy(qrcodeSign,  0, qrcode, 0, qrcodeSign.length);
        //支付账户用户私钥签名
        byte[] sign = sm2.sign(qrcodeSign, sm2.getPublicKey(), sm2.getPrivateKey());
        qrcode[qrcodeSign.length] = (byte) 0x15;
        System.arraycopy(sign, 0, qrcode, qrcodeSign.length + 1, 64);
        String imgPath = "E:\\weconex\\"+"6060000071387001.png";
        QrCode qrCodeBean = new QrCode();
        byte[] imagByte = qrCodeBean.createQrCode1(qrcode,imgPath);

        try {
            FileOutputStream fos = new FileOutputStream(new File(imgPath));
            fos.write(imagByte);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @GetMapping("/v2/test/qrcode")
    public void testImage2(){

//        SM2KeyPair sm2 = new SM2KeyPair();
//        sm2.generateKeyPair();
//
//        String publicHexKey = sm2.getPublicKeyHex();
//        byte[] publicKey = sm2.getPublicKey();
//        byte[] privateKey = sm2.getPrivateKey();
//
//        System.out.println("publicHexKey:"+publicHexKey);
//        System.out.println("publicKey:"+new String(publicKey));
//        System.out.println("privateKey:"+new String(privateKey));

        Map reqMap = new HashMap();
//        reqMap.put("appId","2019011810021");
//        reqMap.put("method","njcc.sp.member.busqrcode.download");
//        reqMap.put("format","JSON");
//        reqMap.put("charset","utf-8");
//        reqMap.put("signType","MD5");
//        reqMap.put("sign","F82C36F086B90432B62D70AA5417E777");
//        reqMap.put("timestamp","2014-07-24 03:07:50");
//        reqMap.put("version","1.0");
//        reqMap.put("memberCode","30000001155");
//        reqMap.put("payAccountNo","3010000000581005");
//        reqMap.put("memberType","01");
//        reqMap.put("cardNo","6060000071387001");
        reqMap.put("appId","2019011810021");
        reqMap.put("method","njcc.sp.member.v2.yunCodeDownByBus");
        reqMap.put("format","JSON");
        reqMap.put("charset","utf-8");
        reqMap.put("signType","MD5");
        reqMap.put("sign","F82C36F086B90432B62D70AA5417E777");
        reqMap.put("timestamp","2014-07-24 03:07:50");
        reqMap.put("version","1.0");
        reqMap.put("memberCode","30000001155");
        reqMap.put("payAccountNo","3010000000581005");
        reqMap.put("memberType","01");
        reqMap.put("cardNo","6060000000316001");
//        reqMap.put("publicKey",publicHexKey);
        Map map = iSclient.queryQrCode(reqMap);
        Map respBody = (Map) map.get("respBody");
        String image = String.valueOf(respBody.get("imagedate"));
        byte[] bt = HexUtil.toByteArray(image);
        try {
            String imgPath = "E:\\weconex\\"+"6060000071387001.png";
            FileOutputStream fos = new FileOutputStream(new File(imgPath));
            fos.write(bt);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
