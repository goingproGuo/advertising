package com.qsc.advertising.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyu
 * @date 2023/2/14 10:24
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {

        return "hello";

    }

}
