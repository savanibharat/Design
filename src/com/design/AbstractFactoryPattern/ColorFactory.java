package com.design.AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory{
	
	
	public Color getColor(String colortype)
	{
		if(colortype==null)
			return null;
		if(colortype.equalsIgnoreCase("red"))
			return new Red();
		if(colortype.equalsIgnoreCase("green"))
			return new Green();
		return null;
				
	}
	public Shape getShape(String shapetype)
	{
		return null;
	}
}
