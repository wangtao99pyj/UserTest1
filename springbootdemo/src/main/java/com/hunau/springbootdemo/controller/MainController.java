package com.hunau.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
    @RequestMapping("/add")
    public String address() {
        return "address";
    }
}
