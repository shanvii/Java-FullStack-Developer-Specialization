package com.courseraSpringContainer.spring.ioc;

public class HelloWorld {
	
	private String message;
	
	//needed for setter based DI
	public HelloWorld() {
		System.out.println("Default constructor called");
	}
	
	public HelloWorld(String message) {
		super();
		this.message = message;
		System.out.println("Parametarised constructor called, message: " + message);
	}

	//getter method
	public String getMessage() {
		return message;
	}

	//setter method
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter method called, message: " + message);
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]"; //printed on console
	}
	
}