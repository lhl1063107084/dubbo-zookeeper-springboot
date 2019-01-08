package com.dubbo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liuxiaolun
 * @Description: 用户实体
 * @date 2019-01-08 11:13:14
 **/
@Getter
@Setter
@ToString
public class User implements Serializable{

    private String name;
}
