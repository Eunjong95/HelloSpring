package com.sample.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configurable
@ComponentScan(basePackages = { "com.sample.myapp" })
@ImportResource(value = { "classpath:application-config.xml" })
public class AppConfig {
	//Autowired 안하면 의존성 주입이 안됨
	@Autowired 
	IHelloService helloService;

	@Bean
	IHelloService helloService() { // 메소드 이름이 bean의 이름
		return new HelloService();
	}

	@Bean
	HelloController helloController() {
		HelloController controller = new HelloController(helloService);
		return controller;
	}
}
