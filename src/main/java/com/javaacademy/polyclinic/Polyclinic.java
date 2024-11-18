package com.javaacademy.polyclinic;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Getter
@Slf4j
public class Polyclinic {
    //    private Doctor dentist;
//    private Doctor therapist;
//    private Doctor surgeonJunior;
//    private Doctor surgeonSenyor;
    private Map<Specialization, ArrayList<Doctor>> doctors = new HashMap<>();
    private CashBox cashbox;

//    public Polyclinic(@Qualifier ("dentist") Doctor doctor1,
//                      @Qualifier ("therapist") Doctor doctor2,
//                      @Qualifier ("surgeonJunior") Doctor doctor3,
//                      @Qualifier ("surgeonSenyor") Doctor doctor4,
//                      @Qualifier ("cashbox") CashBox cashbox) {
//        this.dentist = doctor1;
//        this.therapist = doctor2;
//        this.surgeonJunior = doctor3;
//        this.surgeonSenyor = doctor4;
//        this.cashbox = cashbox;
//    }

    public Polyclinic(List<Doctor> doctorsBeans, @Qualifier("cashbox") CashBox cashbox) {
        for (int i = 0; i < doctorsBeans.size(); i++) {
            addToMap(doctors, doctorsBeans.get(i).getSpecialization(), doctorsBeans.get(i));
        }
        this.cashbox = cashbox;
    }

    public static void addToMap(Map<Specialization, ArrayList<Doctor>> map, Specialization key, Doctor value) {
        // Проверяем, есть ли уже список по данному ключу
        ArrayList<Doctor> list = map.get(key);

        // Если списка нет, создаем новый
        if (list == null) {
            list = new ArrayList<>();
            map.put(key, list);  // Добавляем новый список в карту

        }
        // Добавляем элемент в список
        list.add(value);
        log.info("Добавили элемент в лист {}", value.getCost());
    }

    public void treatDentist() {
        doctors.get(Specialization.DENTIST).get(0).curePeople();
        cashbox.acceptPayment(doctors.get(Specialization.DENTIST).get(0).getCost());
    }

    public void treatTherapist() {
        doctors.get(Specialization.THERAPIST).get(0).curePeople();
        cashbox.acceptPayment(doctors.get(Specialization.THERAPIST).get(0).getCost());
    }

    public void treatSurgeonJunior() {
        doctors.get(Specialization.SURGEON).get(0).curePeople();
        cashbox.acceptPayment(doctors.get(Specialization.SURGEON).get(0).getCost());
    }

    public void treatSurgeonSenyor() {
        doctors.get(Specialization.SURGEON).get(1).curePeople();
        cashbox.acceptPayment(doctors.get(Specialization.SURGEON).get(1).getCost());
    }

//    public void treatDentist() {
//        dentist.curePeople();
//        cashbox.acceptPayment(dentist.getCost());
//    }
//    public void treatTherapist() {
//        dentist.curePeople();
//        cashbox.acceptPayment(therapist.getCost());
//    }
//    public void treatSurgeonJunior() {
//        dentist.curePeople();
//        cashbox.acceptPayment(surgeonJunior.getCost());
//    }
//    public void treatSurgeonSenyor() {
//        dentist.curePeople();
//        cashbox.acceptPayment(surgeonSenyor.getCost());
//    }


}
