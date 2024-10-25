package com.example.Config;

import com.example.demo.PrototypeService;
import com.example.demo.DemoService;
import com.example.demo.RequestScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;


@Configuration
public class DemoConfig {

    private static final Logger log = LoggerFactory.getLogger(DemoConfig.class);

    @Bean
    public DemoService demoService() {
        log.info("HERE I STARTED TO WORK");
        return new DemoService("GREEN");
    }

    @Bean
    @Scope("prototype")
    public PrototypeService prototypeService() {
        log.info("Creating PrototypeService instance");
        return new PrototypeService();
    }

}
