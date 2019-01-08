package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.TestService;

/**
 * @author liuxiaolun
 * @Description: 测试客户端是否可以作为服务端
 * @date 2019-01-08 14:57:00
 **/
@Service  //dubbo注解
public class TestServiceImpl implements TestService {

    public void test() {
        System.out.println("测试通过");
    }
}
