package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PrototypeService {

    private static final Logger log = LoggerFactory.getLogger(PrototypeService.class);
    private String message;

    public PrototypeService() {
        this.message = "Prototype Service Instance";
        log.info(message);
    }

    public String getMessage() {
        return message;
    }
}
