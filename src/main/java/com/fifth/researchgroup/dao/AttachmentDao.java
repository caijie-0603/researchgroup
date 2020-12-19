package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.MessageAttachment;

import java.util.List;

public interface AttachmentDao {
    public int addAttachment(MessageAttachment attachment);

    public List<String> queryMsgAttachment(int msgId);
}
