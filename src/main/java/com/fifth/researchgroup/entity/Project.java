package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Project {      //成果项目类
    private int id;
    private String name;
    private String administratorId;     //负责人的id
    private int senderId;       //发布人的id
    private String summary;     //项目概述
    private String target;      //项目目标
    private String content;     //项目内容
    private Date sendTime;      //发布时间
    private int isAudit;        //是否审核
}
