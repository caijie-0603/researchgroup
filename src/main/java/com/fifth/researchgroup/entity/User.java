package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {     //成员类

    private int id;             //id
    private String phone_number;    //手机号
    private String password;        //密码
    private String name;        //姓名
    private int gender;         //性别  0：女  1：男
    private int age;            //年龄
    private String degree;      //学位
    private String email;       //邮箱
    private int identity;       //身份    0：团队成员  1：信息发布员 2：审核员
    private String head_pic;     //头像路径

}
