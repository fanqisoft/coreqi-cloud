package cn.coreqi.springcloud.services;

import cn.coreqi.springcloud.emtities.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
