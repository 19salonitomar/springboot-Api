package com.spring.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Create an object of the class
public class Dev {

    @Qualifier("desktop")

    @Autowired  //Field Injection
    private Computer comp;

        //Constructor Injection , @Autowired mention is optional:
//        public Dev(Laptop laptop){
//            this.laptop = laptop;
//        }

        //Setter Injection , @Autowired mention is compulsory:
//        public void setLaptop(Laptop laptop){
//            this.laptop = laptop;
//        }


    public void build() {
        comp.compile();
        System.out.println("Working on Awesome Project with springBoot");
    }
}
