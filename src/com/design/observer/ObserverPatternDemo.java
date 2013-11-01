package com.design.observer;

public class ObserverPatternDemo {
public static void main(String[] args) {
	Subject subject=new Subject();
	
	new BinaryObserver(subject);
	new OctalObserver(subject);
	
	System.out.println("First state change 15");
	subject.setState(8);
	
	System.out.println("second subject change 8");
	subject.setState(11);
}
}
