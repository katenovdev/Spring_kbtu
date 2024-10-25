package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    private final CustomEventPublisher eventPublisher;

    public EventController(CustomEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @GetMapping("/publish")
    public String publish() {
        eventPublisher.publishEvent("Привет от события!");
        return "Событие отправлено!";
    }
}
