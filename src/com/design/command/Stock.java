package com.design.command;

public class Stock {
	private int quantity=10;
	private String name="abc";
	public void buy()
	{
		System.out.println("Bought "+name+" with "+quantity+" quantity");
	}
	public void sell()
	{
		System.out.println("Sold "+name+" with "+quantity+" quantity");
	}
}
