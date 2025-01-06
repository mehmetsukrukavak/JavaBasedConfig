package com.mehmetsukrukavak.config;

import com.mehmetsukrukavak.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //@Bean(name = {"desk","desktop"})
    @Bean(name = "desk")
    public Desktop desktop(){
        return new Desktop();
    }
}
