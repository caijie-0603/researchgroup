package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.MessageDao;
import com.fifth.researchgroup.entity.Message;
import com.fifth.researchgroup.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;
    @Override
    public List<Message> findAllMessages() {
        return messageDao.findAllMessages();
    }

    @Override
    public List<Message> findMessagesByType(int type) {
        return messageDao.findMessagesByType(type);
    }

    @Override
    public void addMessage(Message message) {
        messageDao.addMessage(message);
    }

    @Override
    public void deleteMessage(int id) {
        messageDao.deleteMessage(id);
    }
}