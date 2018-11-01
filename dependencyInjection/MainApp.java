package com.spring.dependencyInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		TextEditor textEditor = (TextEditor) context.getBean("textEditorConstructorDI");
		textEditor.spellCheck();

		context.registerShutdownHook();
	}

}
