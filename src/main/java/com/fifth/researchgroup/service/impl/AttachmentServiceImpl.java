package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.AttachmentDao;
import com.fifth.researchgroup.entity.MessageAttachment;
import com.fifth.researchgroup.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    AttachmentDao attachmentDao;

    @Override
    public int addAttachment(MessageAttachment attachment) {
        return attachmentDao.addAttachment(attachment);
    }

    @Override
    public List<String> queryMsgAttachment(int msgId) {
        return attachmentDao.queryMsgAttachment(msgId);
    }
}
