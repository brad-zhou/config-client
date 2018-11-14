package com.brad.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubd
 * @Date 2018/11/13 14:05
 * @@Description
 */
@RestController("/")
public class FooController {
    @Value("${foo}")
    private String foo;

    @GetMapping("foo")
    public String foo() {
        return foo;
    }
}
