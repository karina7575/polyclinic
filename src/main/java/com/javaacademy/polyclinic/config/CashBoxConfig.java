package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.CashBox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashBoxConfig {

    @Bean
    public CashBox cashbox() {
        return new CashBox();
    }
}
