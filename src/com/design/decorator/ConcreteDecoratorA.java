package com.design.decorator;

public class ConcreteDecoratorA extends Decorator{
	private String addedState;
	public ConcreteDecoratorA(Component component)
	{
		super(component);
	}
	private String addedBehavior(String in){
		return "<em>"+addedState+"</em>";
	}
	
	public String operation()
	{
		addedState=super.operation();
		return addedBehavior(addedState);
	}

}
