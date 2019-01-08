package com.dubbo.service;

import com.dubbo.model.User;

/**
 * @author liuxiaolun
 * @Description: 作为客户端需要引用服务端的提供的接口(jar形式), 此处为了简单本地创建
 * 注意:包路径与类名要跟服务方一致
 * @date 2019-01-08 13:49:41
 **/
public interface UserService {
    String userSave(User user);
}
