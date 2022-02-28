package com.yumumu.splitDataServer.service;

import com.yumumu.splitDataServer.interfaces.IDemoService;

public class FirstDemoServiceImpl implements IDemoService {
    @Override
    public String getFullName(String name) {
        System.out.println("invoke: com.yumumu.splitDataServer.service.FirstDemoServiceImpl");
        return "First Demo: " + name;
    }
}
