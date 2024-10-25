package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestScopeController {

    private final RequestScopeService requestScopeService;

    public RequestScopeController(RequestScopeService requestScopeService) {
        this.requestScopeService = requestScopeService;
    }

    @GetMapping("/request-scope")
    public String getMessage() {
        return requestScopeService.getMessage();
    }
}
