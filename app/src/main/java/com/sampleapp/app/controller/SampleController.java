package com.sampleapp.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/print-param")
    @ResponseBody
    public String printParameter(@RequestParam String param) {
        String result = "Parameter: " + param;
        System.out.println(result);
        return result; 
    }
}