package com.design.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
	
	public Color getColor(String getColor)
	{
		return null;
	}
	public Shape getShape(String shapetype)
	{
		if(shapetype==null)
			return null;
		if(shapetype.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapetype.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
	}
	
	

}
