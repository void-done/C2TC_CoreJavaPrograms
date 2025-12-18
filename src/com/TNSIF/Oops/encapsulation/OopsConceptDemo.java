package com.TNSIF.Oops.encapsulation;

public class OopsConceptDemo {
	
// we can do all this in the class that does not have main function
//variables
//methods
//@ override
	
	// Data members
	private int serialNum;  // private can be accessible only in the same class
	private String name; 
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// getters and setters method
	public int getSerialNum() { // is used to get the variable
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) {  // is used to set the variable
		this.serialNum = serialNum;  // this keyword refers to the current object
	}
	
	
	// Object class method - to return string representation of the
	@Override
	public String toString() {
		return "OopsConceptDemo [serial number =" + serialNum + ", " + "name =" + name +", " + "age = " + age + "]" ; 
	}
}


