package com.design.StatePattern;

public class StartState implements State {
	
	public void doAction(Context context)
	{
		System.out.println("In start state");
		context.setState(this);
	}
	public String toString()
	{
		return "Start State";
	}

}
