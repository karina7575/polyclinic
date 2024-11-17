package com.javaacademy.polyclinic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class DoctorConfig {

    @Bean
    public Doctor doctor1() {
        return new Doctor(BigDecimal.valueOf(2500), Specialization.DENTIST);
    }
    @Bean
    public Doctor doctor2() {
        return new Doctor(BigDecimal.valueOf(1500), Specialization.THERAPIST);
    }
    @Bean
    public Doctor doctor3() {
        return new Doctor(BigDecimal.valueOf(2000), Specialization.SURGEON);
    }
    @Bean
    public Doctor doctor4() {
        return new Doctor(BigDecimal.valueOf(3000), Specialization.SURGEON);
    }

}
