package com.TNSIF.Oops.inheritance;

public class Citizens {
	private String name;
	private String address;
	private String aadharno;
	private Long phno;
	
	
	public Citizens() {
		System.out.println("Citizens object created");
		
	}
	
	public Citizens(String name, String address, String aadharno, Long phno) {
		
		this.name = name;
		this.address = address; 
		this.aadharno = aadharno;
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [ name = " + name + ",  address =" + address + ",  aadharno = " + aadharno + ",  phno = " + phno + "]";
	}

}
