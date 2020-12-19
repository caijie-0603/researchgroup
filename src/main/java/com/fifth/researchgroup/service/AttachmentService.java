package com.fifth.researchgroup.service;

import com.fifth.researchgroup.entity.MessageAttachment;

import java.util.List;

public interface AttachmentService {
    public int addAttachment(MessageAttachment attachment);

    public List<String> queryMsgAttachment(int msgId);

}
