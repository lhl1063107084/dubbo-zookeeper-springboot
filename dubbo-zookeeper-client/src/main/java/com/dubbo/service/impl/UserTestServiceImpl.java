package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.UserService;
import com.dubbo.model.User;
import com.dubbo.service.UserTestService;
import org.springframework.stereotype.Service;

/**
 * @author liuxiaolun
 * @Description: 客户端测试服务类实现
 * @date 2019-01-08 11:34:21
 **/
@Service  ////dubbo注解
public class UserTestServiceImpl implements UserTestService {
    @Reference  //dubbo注解
    UserService userService;

    public String userTest(User user) {
        String result = userService.userSave(user);
        return result;
    }
}
