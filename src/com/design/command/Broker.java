package com.design.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> orderlist=new ArrayList<Order>();
	
	public void takeOrder(Order order){
		orderlist.add(order);
		//System.out.println("inside takeOrder "+orderlist.toString());
	}
	public void placeOrder()
	{
		for (Order order : orderlist) {
			order.execute();
		}
		orderlist.clear();
	}
}
