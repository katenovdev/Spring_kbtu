package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class RequestScopeService {

    private static final Logger log = LoggerFactory.getLogger(RequestScopeService.class);
    private final String message;

    public RequestScopeService() {
        this.message = "Request Scope Service Instance";
        log.info("RequestScopeService created: {}", this);
    }

    public String getMessage() {
        return message;
    }
}
