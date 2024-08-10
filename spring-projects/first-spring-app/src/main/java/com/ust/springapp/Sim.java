package com.ust.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("airtel")
public class Sim {

    @Value("${sim.phoneno}")
    private long phoneNo;
    @Value("${sim.network}")
    private String network; // 4G/5G etc

    public  Sim(){
        System.out.println("Sim bean Created");
    }

    public void call(){
        System.out.println("Making a call");
    }

    public void sendText(String name){
        System.out.println("Sending text to "+name);
    }

    public void printDetails(){
        System.out.println("Phone No : "+phoneNo);
        System.out.println("Network : "+network);
    }

}
