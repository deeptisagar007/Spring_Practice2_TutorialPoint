package com.spring.beanInheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld world = (HelloWorld) context.getBean("inheritanceBeanWorld");
		HelloIndia India = (HelloIndia) context.getBean("inheritanceBeanIndia");

		System.out.println("World Object Message1: " + world.getWorldMessage1());
		System.out.println("World Object Message2: " + world.getWorldMessage2());
		System.out.println("*********************************************************************************");
		System.out.println("India Object Message1: " + India.getIndiaMessage1());
		System.out.println("India Object Message2: " + India.getIndiaMessage2());
		System.out.println("India Object Call World variable WorldMessage1: " + India.getWorldMessage1());
		System.out.println("India Object Call World variable WorldMessage2: " + India.getWorldMessage2());
	}

}
