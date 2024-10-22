package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit {
	

	public Apple() {
		super();
	}
	
	
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
		
	}
	
	@Override
	public String taste()
	{
		return "Sweet and sour";
	}
	
	@Override
	void accept(Scanner sc) {
		System.out.println("Enter apple color");
		color=sc.next();
		System.out.println("Enter apple weight");
		weight=sc.nextDouble();
		System.out.println("Enter apple name");
		name=sc.next();
	}
	


}
