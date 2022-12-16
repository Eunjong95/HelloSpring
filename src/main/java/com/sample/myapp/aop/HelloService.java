package com.sample.myapp.aop;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		String message = "Hello~~" + name;
		System.out.println("HelloService.sayHello() 실행");
		return message;
	}

	@Override
	public String sayGoodBye(String name) {
		String message = "GoodBye~~~" + name;
		System.out.println("HelloService.sayGoodBye() 실행");
		if (Math.random() < 0.5) {
			throw new RuntimeException("GoodBye Exception");
		}
		return message;
	}

}
