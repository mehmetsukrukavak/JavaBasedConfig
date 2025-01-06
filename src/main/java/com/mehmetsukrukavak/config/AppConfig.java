package com.mehmetsukrukavak.config;

import com.mehmetsukrukavak.Alien;
import com.mehmetsukrukavak.Computer;
import com.mehmetsukrukavak.Desktop;
import com.mehmetsukrukavak.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.mehmetsukrukavak")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com){   //@Autowired  @Qualifier("desk")
//        Alien alien = new Alien();
//        alien.setAge(57);
//        alien.setName("Alien");
//        alien.setComputer(com);
//        return alien;
//    }
//    //@Bean(name = {"desk","desktop"})
//    @Bean(name = "desk")
//    //@Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean(name = "laptop")
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
