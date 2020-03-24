package cn.coreqi.springcloud.services.impl;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.services.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
