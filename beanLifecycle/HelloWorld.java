package com.spring.beanLifecycle;

public class HelloWorld {
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void initabc() {
		System.out.println("In Initabc method");
	}

	public void destroy() {
		System.out.println("In Destroy method");
	}

}
