package cn.coreqi.springcloud.services;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")   //微服务在注册中心的名称
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")    //调用微服务的地址
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
