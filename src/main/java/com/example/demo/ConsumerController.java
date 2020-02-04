package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConsumerController
 * @Description TODO
 * @Date 2020/2/3 18:31
 * @Created by sparkxiong
 */

@RestController
public class ConsumerController {

    @Qualifier("falbacktets")
    @Autowired
    private Feiginclient feignClient;

    @GetMapping("/test")
    public String testsss() {
        return feignClient.hi();
    }
}
