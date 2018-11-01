package com.spring.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		SingleTonExample singleTonExample = (SingleTonExample) context.getBean("singleTon");
		System.out.println("Default Bean Message: " + singleTonExample.getMessage());

		SingleTonExample singleTonExample2 = (SingleTonExample) context.getBean("singleTon");
		singleTonExample2.setMessage("Message Set from Second Object");

		System.out.println("Message from first object: " + singleTonExample.getMessage());
		System.out.println(" ");

		PrototypeExample prototypeExample = (PrototypeExample) context.getBean("prototype");
		System.out.println("prototype Default Bean Message:  " + prototypeExample.getMessage());

		PrototypeExample prototypeExample2 = (PrototypeExample) context.getBean("prototype");
		prototypeExample2.setMessage("prototype2 Message Set from Second Object");
		System.out.println("prototype2 Second object message call: " + prototypeExample2.getMessage());

		System.out.println("prototype Default Bean Message:  " + prototypeExample.getMessage());
	}

}
