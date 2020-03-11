package cn.coreqi.springcloud.controller;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;  //用于测试在负载的情况下由那个服务提供者提供的服务

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果： " + result);
        if(result > 0){
            return  new CommonResult(200,"插入数据库成功,serverPort: " + serverPort,result);
        }else{
            return  new CommonResult(400,"插入数据库失败,serverPort: " + serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("******查询结果： " + result);
        if(result != null){
            return  new CommonResult(200,"查询成功,serverPort: " + serverPort,result);
        }else{
            return  new CommonResult(400,"没有对应记录，查询Id： " + id + ",serverPort: " + serverPort,null);
        }
    }
}
