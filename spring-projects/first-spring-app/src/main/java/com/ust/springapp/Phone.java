package com.ust.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component("iPhone")
//@Scope("prototype")
@Lazy
public class Phone {

    @Autowired
    @Qualifier("airtel")
    private Sim mysim;

    @Autowired
    private Scanner scanner;

    @Value("${phone.brand}")
    private String brand;
    @Value("${phone.model}")
    private String model;
    @Value("${phone.price}")
    private float price;

    public Phone(){
        System.out.println("Phone bean created");
    }

    public void setMysim(Sim mysim) {
        this.mysim = mysim;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void call(){
        mysim.call();
    }

    public void sendText(){
        System.out.println("Whom to text?");
        String name = scanner.nextLine();
        mysim.sendText(name);
    }

    public void printDetails(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
        mysim.printDetails();

    }


}
