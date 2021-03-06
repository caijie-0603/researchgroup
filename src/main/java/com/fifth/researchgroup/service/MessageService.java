package com.fifth.researchgroup.service;

import com.fifth.researchgroup.entity.Message;

import java.util.List;

public interface MessageService {

    public List<Message> findAllMessages();     //查找所有新闻通知

    public List<Message> findMessagesByType(int type);      //根据类型查找新闻

    public int addMessage(Message message);    //添加新闻通知

    public int deleteMessage(int id);  //删除通知新闻

    public int auditMessage(int id);    //审核新闻通知

    public List<Message> findNoAuditMessages();  //查询未审核的通知新闻

    public List<Message> findAuditMessages();  //查询已审核的通知新闻

    public Message findMessageById(int id);       //根据id查询通知新闻

}
