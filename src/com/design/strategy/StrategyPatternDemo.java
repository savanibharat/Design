package com.design.strategy;

public class StrategyPatternDemo {
	
	public static void main(String[] args) {
		
		Context context=new Context(new StrategyPhase1());
		System.out.println("in main new StrategyPhase1() "+context.doOperation());
		
		context=new Context(new StrategyPhase2());
		System.out.println("in main new StrategyPhase2() "+context.doOperation());
	}

}
