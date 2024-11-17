package com.javaacademy.polyclinic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class CashBoxConfig {

    @Bean
    public CashBox cashbox() {
        return new CashBox();
    }
}
