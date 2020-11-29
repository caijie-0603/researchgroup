package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Message {      //新闻通知类
    private int id;
    private int sender_id;  //发布人id
    private String title;   //标题
    private String content;     //内容
    private Date send_time;     //发布时间
    private int type;       //类型 0：通知  1：新闻
    private int is_audit;   //是否审核 0：未审核  1：已审核
}
