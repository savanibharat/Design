package com.design.StatePattern;

public class StopState implements State {
	
	public void doAction(Context context){
		System.out.println("in stop state");
		context.setState(this);
	}
	public String toString(){
		return "Stop state";
	}

}
