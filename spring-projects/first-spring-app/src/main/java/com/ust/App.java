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

        Phone phone = appContext.getBean("samsung",Phone.class);

        phone.printDetails();

//        iPhone15.call();
//        iPhone15.sendText();

//        Scanner scan = appContext.getBean(Scanner.class);

    }
}
