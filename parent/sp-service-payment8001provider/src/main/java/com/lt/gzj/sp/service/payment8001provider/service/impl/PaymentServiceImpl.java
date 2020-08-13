package com.lt.gzj.sp.service.payment8001provider.service.impl;

import com.lt.gzj.sp.service.payment8001provider.dao.PaymentDao;
import com.lt.gzj.sp.service.payment8001provider.domain.Payment;
import com.lt.gzj.sp.service.payment8001provider.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentServiceImpl
 * @description:
 * @author: XZQ
 * @create: 2020/3/5 18:19
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
