package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname Feiginclient
 * @Description TODO
 * @Date 2020/2/3 18:32
 * @Created by sparkxiong
 */
@FeignClient(value = "nacos-provider" ,fallback =Falbacktets.class )
public interface Feiginclient {
   static final String INFO="dadad";
    @GetMapping("/hi")
    String hi();

}
