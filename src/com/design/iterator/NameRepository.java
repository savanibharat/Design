package com.design.iterator;

public class NameRepository implements Container
{
	public String names[]={"a","b","c","d"};
	private class NameItertor implements Iterator
	{
		int index;
		@Override
		public boolean hasNext() {
			if(index<names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[index++];
			}
			return null;
		}
	}
	@Override
	public Iterator getIterator() {
		return new NameItertor();
	}
}