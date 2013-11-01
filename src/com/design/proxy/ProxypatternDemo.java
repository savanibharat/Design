package com.design.proxy;

public class ProxypatternDemo {
	public static void main(String[] args) {
		Image image=new ProxyImage("abc.png");
		
		image.display();System.out.println(" ");
		//image.display();
	}
}
