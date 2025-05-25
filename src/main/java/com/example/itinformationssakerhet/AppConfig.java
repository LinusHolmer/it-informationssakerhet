package com.example.itinformationssakerhet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TextFormatter textFormatter() {
        return new TextFormatter();
    }

}
