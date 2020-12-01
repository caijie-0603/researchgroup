package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.Message;

import java.util.List;

public interface MessageDao {

    public List<Message> findAllMessages();     //查找所有新闻通知

    public List<Message> findMessagesByType(int type);      //根据类型查找新闻

    public int addMessage(Message message);    //添加新闻通知

    public int deleteMessage(int id);  //删除通知新闻

    public int auditMessage(int id);    //审核新闻通知

    public List<Message> findNoAuditMessages();  //查询未审核的通知新闻

}
