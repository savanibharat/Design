package com.design.decorator;

public class TesterMain {
	
	public static void main(String[] args) {
		Component com=new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
		System.out.println("in main "+com.operation());
	}
}
