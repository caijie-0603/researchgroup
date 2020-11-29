package com.fifth.researchgroup.controller;

import com.fifth.researchgroup.entity.Message;
import com.fifth.researchgroup.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/message/findAllMessages")
    public List<Message> findAllMessages()
    {
        List<Message> lists;
        lists = messageService.findAllMessages();
        return lists;
    }

    @GetMapping("/message/findMessagesByType")
    public List<Message> findMessagesByType(int type)
    {
        List<Message> lists;
        lists = messageService.findMessagesByType(type);
        return lists;
    }

    @GetMapping("/message/addMessage")
    public void addMessage(Message message)
    {
        messageService.addMessage(message);
    }

    @GetMapping("/message/deleteMessage")
    public void deleteMessage(int id)
    {
        messageService.deleteMessage(id);
    }

}
