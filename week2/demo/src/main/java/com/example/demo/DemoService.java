package com.example.demo;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DemoService {

    private static final Logger log = LoggerFactory.getLogger(DemoService.class);
    private String color;

    public DemoService(String color) {
        this.color = color;
        log.info(color);
    }

    public void performAction() {
        System.out.println("Action performed!");
    }
}
