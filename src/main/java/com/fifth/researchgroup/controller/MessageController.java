package com.fifth.researchgroup.controller;

import com.fifth.researchgroup.entity.Message;
import com.fifth.researchgroup.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/message/addMessage")
    public int addMessage(Message message)
    {
        return messageService.addMessage(message);
    }

    @DeleteMapping("/message/deleteMessage")
    public int deleteMessage(int id)
    {
        return messageService.deleteMessage(id);
    }

    @PutMapping("/message/auditMessage")
    public int auditMessage(int id)
    {
        return messageService.auditMessage(id);
    }

    @GetMapping("/message/findNoAuditMessages")
    public List<Message> findNoAuditMessages()
    {
        return messageService.findNoAuditMessages();
    }


}
