package com.hhymyi.provider.service.impl;

import com.hhymyi.entity.Message;
import com.hhymyi.service.IMessageService;

public class MessageServiceImpl implements IMessageService {
    public Message getMessage(int id) {
        Message message=new Message();
        message.setId(1);
        message.setContent("haha");
        return message;
    }
}
