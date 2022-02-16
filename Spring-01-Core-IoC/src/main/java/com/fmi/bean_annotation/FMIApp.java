package com.fmi.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class FMIApp {
    public static void main (String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
        //Interface interface = new Implementation

        FullTimeMentor ft = container.getBean (FullTimeMentor.class);

        ft.createAccount ();

        String str = container.getBean (String.class);
        System.out.println (str);
    }
}
