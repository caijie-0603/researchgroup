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
    private int user_id;        //用户id
    private String content;     //简历内容
    private Date send_time;   //修改提交时间


}
