package com.design.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcstock=new Stock();
		
		BuyStock buy=new BuyStock(abcstock);
		SellStock sell=new SellStock(abcstock);
		
		Broker broker=new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		broker.placeOrder();
	}
}
