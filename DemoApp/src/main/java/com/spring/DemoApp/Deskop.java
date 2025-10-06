package com.spring.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//@Primary    //If we want to connect this
public class Deskop implements Computer {

    public void compile(){
        System.out.println("Compiling with Desktop 404 bugs");
    }
}
