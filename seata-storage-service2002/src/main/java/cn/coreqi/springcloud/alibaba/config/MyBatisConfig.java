package cn.coreqi.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"cn.coreqi.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
