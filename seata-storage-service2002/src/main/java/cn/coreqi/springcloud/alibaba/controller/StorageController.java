package cn.coreqi.springcloud.alibaba.controller;

import cn.coreqi.springcloud.alibaba.domain.CommonResult;
import cn.coreqi.springcloud.alibaba.services.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @GetMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
