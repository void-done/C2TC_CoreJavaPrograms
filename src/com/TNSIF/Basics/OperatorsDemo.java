package com.TNSIF.Basics;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int x = 10;
		System.out.println("Value of a and b before operations:" +a +" "+b);
		
		a++;
		int c = ++a + b + a--;
		System.out.println("c Value after the operation:" +c);
		
		int d = ++c + a + b--;
		System.out.println("d value after the operation:" +d);
		
		System.out.println("Values of a,b,c,d after the operation:" + a + " " + b + " " + c + " " + d );
		
		x = (10 == x) ? 1 : 0 ;
		System.out.println(x);
	}

}
