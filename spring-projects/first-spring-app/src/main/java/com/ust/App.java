package com.ust;


import com.ust.config.AppConfig;
import com.ust.springapp.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        Phone iPhone15ProMax = appContext.getBean("iPhone",Phone.class);
//
//        iPhone15ProMax.setPrice(129000);
//
//        iPhone15ProMax.printDetails();
//
//        Phone iPhone15 = appContext.getBean("iPhone",Phone.class);

        // iPhone15.printDetails();





//        iPhone15.call();
//        iPhone15.sendText();

//        Scanner scan = appContext.getBean(Scanner.class);



    }
}
