package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.Date;

@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
@Data
public class Resume {       //简历类

    private int id;             //简历id
    private int userId;        //用户id
    private String content;     //简历内容
    private Date sendTime;   //修改提交时间


}
