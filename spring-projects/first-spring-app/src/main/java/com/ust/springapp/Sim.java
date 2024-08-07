package com.ust.springapp;

import org.springframework.stereotype.Component;

@Component
public class Sim {

    public void call(){
        System.out.println("Making a call");
    }

    public void sendText(){
        System.out.println("Sending text");
    }

}
