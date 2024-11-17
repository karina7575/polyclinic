package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@AllArgsConstructor
@Getter
public class Doctor {
    private BigDecimal cost;
    private final Specialization specialization;

    public BigDecimal curePeople() {
        log.info("{} вылечил человека", specialization);
        return cost;
    }

}
