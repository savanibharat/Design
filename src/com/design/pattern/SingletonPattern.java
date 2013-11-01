package com.design.pattern;

import javax.management.InstanceAlreadyExistsException;

public class SingletonPattern
{
	/*Eagar Initialization. Create object everytime you run program. Used if u have sufficient time and resources
	 * private static SingletonPattern instance=new SingletonPattern();
	
	private SingletonPattern()
	{
		
	}
	
	public static SingletonPattern getInstance()
	{
		return instance;
	}
	
	public void showmessgae()
	{
		System.out.println("Hello world");
	}*/
	
	//Lazy initialization: Creates one object and it is shared. 
	private static volatile SingletonPattern instance=null;
	
	private SingletonPattern() throws InstanceAlreadyExistsException
	{
		if(instance!=null)
		{
			System.out.println("Instance already created");
		}
	}
	public static SingletonPattern getInstance() throws InstanceAlreadyExistsException
	{
		if(instance==null)
		{
			synchronized (SingletonPattern.class)
			{
				if(instance==null)
				{
					instance=new SingletonPattern();
				}
			}
		}
		return instance;
	}
	
	public void showmessgae()
	{
		System.out.println("Hello world");
	}
}
