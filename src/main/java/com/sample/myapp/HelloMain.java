package com.sample.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("------------------------------------");
		HelloController helloController = context.getBean(HelloController.class); // HelloController.클래스 라는 타입을 반환해줌
		helloController.hello("홍길동");
		System.out.println("------------------------------------");
		context.close();
	}

}
