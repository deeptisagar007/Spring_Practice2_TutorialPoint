package com.spring.beanLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("lifeCycle");
		System.out.println(helloWorld.getMessage());
		context.registerShutdownHook();
	}

}
