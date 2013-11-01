package com.design.decorator;

public class ConcreteDecoratorB extends Decorator{

	private String addedState;
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	private String addedBehavior(String in){
		return "<h1>"+addedState+"</h1>";
	}
	public String operation()
	{
		addedState=super.operation();
		return addedBehavior(addedState);
	}
}
