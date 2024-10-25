package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private final SessionScopeService sessionScopeService;

    public SimpleController(SessionScopeService sessionScopeService) {
        this.sessionScopeService = sessionScopeService;
    }

    @GetMapping("/store")
    public String storeValue(@RequestParam String value) {
        sessionScopeService.setValue(value);
        return "Value stored in session: " + value;
    }

    @GetMapping("/retrieve")
    public String retrieveValue() {
        String value = sessionScopeService.getValue();
        return value != null ? "Value from session: " + value : "No value found in session.";
    }
}
