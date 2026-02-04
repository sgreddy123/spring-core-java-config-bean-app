package com.khadri.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.beans.Calculater;
import com.khadri.spring.core.beans.Computer;
import com.khadri.spring.core.config.AppConfig;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Computer computer = applicationContext.getBean(Computer.class);

		Calculater calculater = applicationContext.getBean(Calculater.class);
		
		System.out.println(computer);
		System.out.println(calculater);

		computer.compMethod();
		calculater.calMethod();
		
  ((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
