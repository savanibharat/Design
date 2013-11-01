package com.design.factory;

public class FactoryPatternDemo {

	public static void main(String args[])
	{
		ShapeFactory shapefactory=new ShapeFactory();
		
		Shape shape1=shapefactory.getShape("Circle");
		shape1.drawShape();
		
		Shape shape2=shapefactory.getShape("Rectangle");
		shape2.drawShape();
		
		Shape shape3=shapefactory.getShape("Triangle");
		shape3.drawShape();
	}
}
