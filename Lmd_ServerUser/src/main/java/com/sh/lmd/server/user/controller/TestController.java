package com.sh.lmd.server.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test.do")
    public String test(){
        return "success!!";
    }
}
