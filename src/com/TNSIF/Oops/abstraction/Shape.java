package com.TNSIF.Oops.abstraction;

// abstract class

public abstract class Shape {
	protected float area; 
	
	// abstract method
	abstract void calArea();
	
	void show() {
		System.out.println("Area of the shape is" + " " + area);
	}

}
