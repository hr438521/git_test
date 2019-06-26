package com.sh.lmd.api.controller;

import com.sh.lmd.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test.do")
    public String first(){
        return testService.test();
    }
}
