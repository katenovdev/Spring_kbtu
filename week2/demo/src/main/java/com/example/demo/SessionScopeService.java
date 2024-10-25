package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class SessionScopeService {

    private static final Logger log = LoggerFactory.getLogger(SessionScopeService.class);
    private String storedValue;

    public SessionScopeService() {
        log.info("SessionScopeService created: {}", this);
    }

    public void setValue(String value) {
        this.storedValue = value;
        log.info("Value set in session: {}", value);
    }

    public String getValue() {
        return storedValue;
    }
}
