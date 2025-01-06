package com.mehmetsukrukavak;

import com.mehmetsukrukavak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop = context.getBean("desk",Desktop.class);
        desktop.compile();
    }
}
