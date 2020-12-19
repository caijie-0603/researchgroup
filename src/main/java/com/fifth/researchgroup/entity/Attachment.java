package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Attachment {       //附件类
    private int id;
    private int achievementId;  //成果id
    private String name;        //附件名
    private int type;   //0:科研论文 1:项目 2:知识产权
    private String url;
}
