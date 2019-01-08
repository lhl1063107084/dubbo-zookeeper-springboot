package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.dubbo.model.User;
import com.dubbo.service.UserService;

/**
 * @author liuxiaolun
 * @Description: TODO
 * @date 2019-01-08 13:46:17
 **/
@Service
public class UserServiceImpl implements UserService {
    public String userSave(User user) {
        return "用户保存成功" + JSON.toJSONString(user);
    }
}
