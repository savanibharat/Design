package com.design.pattern;

import javax.management.InstanceAlreadyExistsException;


public class SingletonPatternDemo {

	public static void main(String args[]) throws InstanceAlreadyExistsException
	{
		SingletonPattern object=SingletonPattern.getInstance();
		
		object.showmessgae();
		
	}
	
}
