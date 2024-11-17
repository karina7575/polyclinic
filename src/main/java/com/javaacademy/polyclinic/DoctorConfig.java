package com.javaacademy.polyclinic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class DoctorConfig {

    @Bean
    public Doctor dentist() {
        return new Doctor(BigDecimal.valueOf(1500), Specialization.DENTIST);
    }
    @Bean
    public Doctor therapist() {
        return new Doctor(BigDecimal.valueOf(500), Specialization.THERAPIST);
    }
    @Bean
    public Doctor surgeonJunior() {
        return new Doctor(BigDecimal.valueOf(700), Specialization.SURGEON);
    }
    @Bean
    public Doctor surgeonSenyor() {
        return new Doctor(BigDecimal.valueOf(2000), Specialization.SURGEON);
    }

}
