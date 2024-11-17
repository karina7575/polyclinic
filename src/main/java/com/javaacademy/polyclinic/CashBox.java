package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
public class CashBox {

    private BigDecimal income = BigDecimal.ZERO;

    public void acceptPayment(BigDecimal cash) {
        income = income.add(cash);
    }

    public void printIncome() {
        log.info("В кассе {}", income);
    }
}
