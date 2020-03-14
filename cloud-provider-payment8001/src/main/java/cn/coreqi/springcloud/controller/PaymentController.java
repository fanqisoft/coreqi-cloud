package cn.coreqi.springcloud.controller;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

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
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("******查询结果： " + result);
        if(result != null){
            return  new CommonResult(200,"查询成功,serverPort: " + serverPort,result);
        }else{
            return  new CommonResult(400,"没有对应记录，查询Id： " + id + ",serverPort: " + serverPort,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();	//获取所有在Eureka中注册的服务名称列表
        for(String service : services){
            log.info("serviceName: " + service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);	//根据服务名获取服务的详细信息
            for(ServiceInstance instance : instances){
                log.info("服务Id: " + instance.getServiceId());
                log.info("服务主机: " + instance.getHost());
                log.info("服务端口: " + instance.getPort());
                log.info("服务Uri: " + instance.getUri());
            }
        }
        return this.discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            //暂停几秒钟线程
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return serverPort;
    }
}
