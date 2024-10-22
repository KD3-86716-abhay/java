package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruit {
	
	public Mango() {
		super();
	}
	
	
	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
		
	}
	@Override
	public String taste()
	{
		return "sweet";
	}


	@Override
	void accept(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
}
