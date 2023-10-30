package com.enset.ma.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {
    @Value("${customer.params.x}")
    private String x;

    @GetMapping("/params")
    public String index() {
        return "Hello " + x;
    }
}
