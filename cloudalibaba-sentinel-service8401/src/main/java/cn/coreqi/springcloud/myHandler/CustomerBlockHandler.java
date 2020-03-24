package cn.coreqi.springcloud.myHandler;

import cn.coreqi.springcloud.core.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException ex){
        return new CommonResult(444,"按客户自定义,Global HandlerException---------1");
    }

    public static CommonResult handlerException2(BlockException ex){
        return new CommonResult(444,"按客户自定义,Global HandlerException---------2");
    }

}

