package com.TNSIF.Oops.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		
		
		Square sq = new Square();
		Rectangle r1 = new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------");
		
		
		Shape shape;
		shape = new Square(12.7f);
		shape.calArea();
		shape.show();
		
		
		shape = new Rectangle(20,30);
		shape.calArea();
		shape.show();
		
		System.out.println("------------------------------");
		

	}

}
