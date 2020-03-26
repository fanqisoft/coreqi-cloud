package cn.coreqi.springcloud.alibaba.services;

public interface StorageService {
    //扣减库存
    void decrease(Long productId, Integer count);
}
