package com.hhymyi.service;

import com.hhymyi.entity.Message;

import java.util.List;
import java.util.Map;

public interface IMessageService {
    Message getMessage(int id);

    List<Map<String,Object>> getList();
}
