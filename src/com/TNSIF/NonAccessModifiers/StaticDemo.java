package com.TNSIF.NonAccessModifiers;

public class StaticDemo {
	
	//Static Variable
	static int count;
	
	//static block
	static {
		count = 20;
		System.out.println("Shows the static count assigned : " + count);
	}
	
	//static method
	static void show() {
		System.out.println("Method runs in static with count of :" + count);
	}
	
	public static void main(String [] args) {
		System.out.println("Static in main method : " + count);
		
		show();  // calling the method
	}
	

}
