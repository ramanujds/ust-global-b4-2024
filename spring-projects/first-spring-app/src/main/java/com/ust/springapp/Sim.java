package com.ust.springapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("airtel")
public class Sim {

    private long phoneNo;
    private String network; // 4G/5G etc

    public void call(){
        System.out.println("Making a call");
    }

    public void sendText(String name){
        System.out.println("Sending text to "+name);
    }

}
