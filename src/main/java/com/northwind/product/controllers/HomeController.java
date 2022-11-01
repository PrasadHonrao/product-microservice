package com.northwind.product.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Value("${api.version}")
    private String apiVersion;

    @GetMapping
    @RequestMapping("/")
    public Map getApiVersion() {
        Map map = new HashMap<String, String>();
        map.put("api.version", apiVersion);
        return map;
    }
}
