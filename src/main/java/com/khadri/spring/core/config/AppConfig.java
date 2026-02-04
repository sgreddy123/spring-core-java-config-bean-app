package com.khadri.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.khadri.spring.core.beans.Calculater;
import com.khadri.spring.core.beans.Computer;

@Configuration
public class AppConfig {
	
	@Bean
	public Computer computer(){
		return new Computer();
	
	}
	
	@Bean
	public Calculater calculater(){
		return new Calculater();
	
	}

}


