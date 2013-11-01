package com.design.chainOfResponsibility;

public class ConcreteHandlerA implements Handler{
	private Handler successor=null;
	
	public void handleRequest(String request)
	{
		System.out.println("R1 got into request");
		if(request.equalsIgnoreCase("R1"))
		{
			System.out.println(this.getClass().getName()+" this one is mine");
		}
		else
		{
			if(successor!=null)
					successor.handleRequest(request);
		}
	}
	public void setSuccessor(Handler next){
		this.successor=next;
	}
}
