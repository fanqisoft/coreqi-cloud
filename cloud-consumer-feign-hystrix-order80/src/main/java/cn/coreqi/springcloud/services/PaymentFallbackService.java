package cn.coreqi.springcloud.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK,щ(ʘ╻ʘ)щ";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_Timeout,щ(ʘ╻ʘ)щ";
    }
}
