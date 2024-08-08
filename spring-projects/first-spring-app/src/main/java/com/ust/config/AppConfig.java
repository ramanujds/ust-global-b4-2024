package com.ust.config;

import com.ust.springapp.Phone;
import com.ust.springapp.Sim;
import org.springframework.context.annotation.*;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "com.ust.springapp")
@PropertySource("app.properties")
public class AppConfig {

//    @Bean("jio")
//    public Sim getSim(){
//        return new Sim();
//    }
//
//    @Bean("samsung")
//    public Phone getPhone(){
//        Phone phone = new Phone();
//        phone.setMysim(getSim());
//        phone.setBrand("Samsung");
//        phone.setModel("S24 Ultra");
//        phone.setPrice(150000);
//        return phone;
//    }

    @Bean
    public Scanner getScanner(){
        return new Scanner(System.in);
    }


}
