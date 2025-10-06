package com.spring.DemoApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void compile(){
        System.out.println("Compiling with Laptop 404 bugs");
    }


}
