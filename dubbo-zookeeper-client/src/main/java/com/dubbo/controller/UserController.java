package com.dubbo.controller;

import com.dubbo.service.UserTestService;
import com.dubbo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaolun
 * @Description: TODO
 * @date 2019-01-08 13:03:07
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserTestService userTestService;

    @RequestMapping("/test")
    public void test() {
        User user = new User();
        user.setName("123");
        String s = userTestService.userTest(user);
        System.out.println("-----" + s);
    }
}
