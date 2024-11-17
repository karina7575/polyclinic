package com.javaacademy.polyclinic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Polyclinic {

    private Doctor doctor1;
    private Doctor doctor2;
    private Doctor doctor3;
    private Doctor doctor4;
    private CashBox cashbox;

    public Polyclinic(@Qualifier ("doctor1") Doctor doctor1,
                      @Qualifier ("doctor2") Doctor doctor2,
                      @Qualifier ("doctor2") Doctor doctor3,
                      @Qualifier ("doctor4") Doctor doctor4,
                      @Qualifier ("cashbox") CashBox cashbox) {
        this.doctor1 = doctor1;
        this.doctor2 = doctor2;
        this.doctor3 = doctor3;
        this.doctor4 = doctor4;
        this.cashbox = cashbox;
    }
}
