package com.sh.lmd.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "UserProvider")
public interface TestService {

    @GetMapping("test.do")
    String test();
}
