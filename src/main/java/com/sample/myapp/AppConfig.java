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
	
	@Autowired 
	IHelloService helloService;

	@Bean
	IHelloService helloService() { // 메소드 이름이 bean의 이름
		return new HelloService();
	}

	//@Bean
	HelloController helloController() {
		HelloController controller = new HelloController(helloService); 
		//여기서 helloService()를 쓰면 위에 생성된 빈과 중복되어서(빈이름=메소드이름) 쓰기 불가능함 
		//그리고 helloService를 가져올거면 어딘가에서 helloService에 의존성 주입을 해주는 autowired가 필요함
		return controller;
	}
	
	
}
