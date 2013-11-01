package com.design.iterator;

public class IteratorPatternDemo
{
	public static void main(String[] args) {
	NameRepository nameRepo=new NameRepository();
	for(Iterator iter =nameRepo.getIterator();iter.hasNext();)
		System.out.println(iter.next());
	
	
	}
}