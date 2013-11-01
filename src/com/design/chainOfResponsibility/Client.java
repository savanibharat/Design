package com.design.chainOfResponsibility;

public class Client {
	public static void main(String[] args) {
		
		Handler h1=new ConcreteHandlerA();
		Handler h2=new ConcreteHandlerB();
		Handler h3=new ConcreteHandlerC();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		System.out.println("sending R2...");
		h1.handleRequest("R2");
		System.out.println("sending R3...");
		h1.handleRequest("R3");
		System.out.println("sending R1...");
		h1.handleRequest("R1");
		System.out.println("sending RX...");
		h1.handleRequest("RX");
	}
}
