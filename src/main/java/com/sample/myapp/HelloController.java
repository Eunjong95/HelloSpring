package com.sample.myapp;

public class HelloController {

	IHelloService helloService;

/*	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}

	public void hello(String name) {
		System.out.println("HelloController: " + helloService.sayHello(name));
	}
}
