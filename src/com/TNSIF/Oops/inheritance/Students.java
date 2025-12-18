package com.TNSIF.Oops.inheritance;

public class Students extends Citizens {
	private int rollno;
	private String collegename;
	
	
	public Students() {
		super();
	}
	
	public Students(String name, String address, String aadharno, Long phno, int rollno, String collegename) {
		super(name, address, aadharno, phno);
		
		this.rollno = rollno;
		this.collegename = collegename;
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	public String toString() {
		
		return "Student [ rollno = " + rollno + ", collegename = " + collegename + ","
				+ " Name = " + getName() + ", Address = " + getAddress() + ", Aadharno = " +
				getAadharno() +  ", Phno = " + getPhno() + "]"; 

		

		
	}

}
