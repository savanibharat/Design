package com.design.command;

public class SellStock implements Order{

	public Stock abcstock;
	public SellStock(Stock abcstock)
	{
		this.abcstock=abcstock;
	}
	@Override
	public void execute() {
		abcstock.sell();		
	}

}
