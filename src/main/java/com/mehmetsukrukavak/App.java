package com.mehmetsukrukavak;

import com.mehmetsukrukavak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = (Alien) context.getBean(Alien.class);

        obj1.code();
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

//        Desktop desktop1 = context.getBean(Desktop.class);
//        desktop1.compile();
//
//        Desktop desktop2 = context.getBean(Desktop.class);
//        desktop2.compile();
    }
}
