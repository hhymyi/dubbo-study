package com.hhymyi.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.hhymyi.entity.Message;
import com.hhymyi.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MessageController {
    @Autowired
    private IMessageService messageService;

    @RequestMapping("/message/{id}")
    public String getMessage(@PathVariable("id") int id) {
        Message message = messageService.getMessage(id);
        return "message>id:" + message.getId() + "  name:" + message.getContent();
    }

    @RequestMapping("/message/list")
    public String getList(){
        List<Map<String, Object>> list = messageService.getList();
        return JSON.toJSONString(list);
    }
}
