package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit {

	
	public Orange() {
		super();
	}
	
	
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
		
	}
		@Override
		public String taste()
		{
			return "sour";
		}
		
		@Override
		void accept(Scanner sc) {
			System.out.println("Enter Orange color");
			color=sc.next();
			System.out.println("Enter Orange weight");
			weight=sc.nextDouble();
			System.out.println("Enter Orange name");
			name=sc.next();
		}

}
