package com.javaacademy.polyclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
		Polyclinic bean = context.getBean(Polyclinic.class);
		bean.treatDentist();
		bean.treatTherapist();
		bean.treatsurgeonJunior();
		bean.treatsurgeonSenyor();
		bean.getCashbox().printIncome();

	}

}
