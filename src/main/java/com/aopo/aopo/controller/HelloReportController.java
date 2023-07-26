package com.aopo.aopo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloReportController {


    @RequestMapping("/report")
    public String report(){
        return "Hello Report !";
    }
}
