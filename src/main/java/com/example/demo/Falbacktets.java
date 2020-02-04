package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @Classname Falbacktets
 * @Description TODO
 * @Date 2020/2/3 18:38
 * @Created by sparkxiong
 */
@Component
public class Falbacktets implements Feiginclient{
    @Override
    public String hi() {
        return INFO;
    }
}
