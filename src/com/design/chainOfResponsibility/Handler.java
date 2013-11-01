package com.design.chainOfResponsibility;

public interface Handler {
	public void handleRequest(String request);
	public void setSuccessor(Handler next);
}
