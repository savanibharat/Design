package com.design.strategy;

public class Context {
	
	NameStrategy strategy;
	public Context(NameStrategy strategy)
	{
		this.strategy=strategy;
	}
	
	public String doOperation()
	{
		return strategy.name();
	}
	
}
