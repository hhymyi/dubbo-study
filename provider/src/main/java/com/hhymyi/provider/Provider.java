package com.hhymyi.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/ApplicationContext.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
