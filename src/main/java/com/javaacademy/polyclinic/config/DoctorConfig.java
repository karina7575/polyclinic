package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.Doctor;
import com.javaacademy.polyclinic.Specialization;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(value = DoctorProperty.class)
public class DoctorConfig {
    private DoctorProperty doctorProperty;

    public DoctorConfig(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorProperty.getRateDentist(), Specialization.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorProperty.getRateTherapist(), Specialization.THERAPIST);
    }

    @Bean
    public Doctor surgeonJunior() {
        return new Doctor(doctorProperty.getRateSurgeonJunior(), Specialization.SURGEON);
    }

    @Bean
    public Doctor surgeonSenyor() {
        return new Doctor(doctorProperty.getRateSurgeonSenyor(), Specialization.SURGEON);
    }

}
