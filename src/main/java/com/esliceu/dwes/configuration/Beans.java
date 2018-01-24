package com.esliceu.dwes.configuration;

import com.esliceu.dwes.domain.Greet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xavi on 25/01/18.
 */
@Configuration
public class Beans {
    @Bean
    public Greet greet(){
        return new Greet("hola");
    }
}
