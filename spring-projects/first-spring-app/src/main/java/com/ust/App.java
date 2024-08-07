package com.ust;


import com.ust.config.AppConfig;
import com.ust.springapp.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Phone iPhone15 = appContext.getBean(Phone.class);

        iPhone15.call();

    }
}
