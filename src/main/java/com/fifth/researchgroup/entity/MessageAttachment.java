package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MessageAttachment {
    private int id;
    private int messageId;  //新闻通知id
    private String name;     //附件名
    private String url;      //附件地址
}
