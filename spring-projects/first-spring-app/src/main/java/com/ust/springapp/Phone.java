package com.ust.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Phone {

    @Autowired
    private Sim sim;


    public void call(){
        sim.call();
    }

    public void sendText(){
        sim.sendText();
    }


}
