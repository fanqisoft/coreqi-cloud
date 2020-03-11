package cn.coreqi.springcloud.services.impl;

import cn.coreqi.springcloud.dao.PaymentDao;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.services.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    //@Autowired    Spring中依赖注入注解
    @Resource   //java中提供的依赖注入注解
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
