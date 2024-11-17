package com.javaacademy.polyclinic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Polyclinic {

    private Doctor dentist;
    private Doctor therapist;
    private Doctor surgeonJunior;
    private Doctor surgeonSenyor;
    private CashBox cashbox;

    public Polyclinic(@Qualifier ("dentist") Doctor doctor1,
                      @Qualifier ("therapist") Doctor doctor2,
                      @Qualifier ("surgeonJunior") Doctor doctor3,
                      @Qualifier ("surgeonSenyor") Doctor doctor4,
                      @Qualifier ("cashbox") CashBox cashbox) {
        this.dentist = doctor1;
        this.therapist = doctor2;
        this.surgeonJunior = doctor3;
        this.surgeonSenyor = doctor4;
        this.cashbox = cashbox;
    }

    public void treatDentist() {
        dentist.curePeople();
        cashbox.acceptPayment(dentist.getCost());
    }
    public void treatTherapist() {
        dentist.curePeople();
        cashbox.acceptPayment(therapist.getCost());
    }
    public void treatsurgeonJunior() {
        dentist.curePeople();
        cashbox.acceptPayment(surgeonJunior.getCost());
    }
    public void treatsurgeonSenyor() {
        dentist.curePeople();
        cashbox.acceptPayment(surgeonSenyor.getCost());
    }

}
