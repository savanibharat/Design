package com.design.proxy;

public class RealImage implements Image{
	private String filename;
	public RealImage(String filename) {
		this.filename=filename;
		loadFromDisk(filename);
	}
	@Override
	public void display() {
		System.out.println("Displaying image "+filename);
	}
	
	public void loadFromDisk(String filename){
		System.out.println("Loading file "+filename);
	}
	

}
