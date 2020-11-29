package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.Message;

import java.util.List;

public interface MessageDao {

    public List<Message> findAllMessages();     //查找所有新闻通知

    public List<Message> findMessagesByType(int type);      //根据类型查找新闻

    public void addMessage(Message message);    //添加新闻通知

    public void deleteMessage(int id);  //删除通知新闻

}
