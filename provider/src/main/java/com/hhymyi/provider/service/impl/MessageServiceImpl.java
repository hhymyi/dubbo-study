package com.hhymyi.provider.service.impl;

import com.hhymyi.provider.dao.MessageMapper;
import com.hhymyi.entity.Message;
import com.hhymyi.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageMapper messageMapper;

    public Message getMessage(int id) {
        Message message = messageMapper.selectByPrimaryKey(id);
        return message;
    }
}
