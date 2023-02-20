package com.example.springbasic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class MyBean1 {
    private final MyBean2 myBean2;
    public void print() {
        System.out.println("MyBean1.print : " + this.getClass().getName());
    }
}