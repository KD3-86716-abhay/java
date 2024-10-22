package com.sunbeam.p3;

import java.util.Scanner;

public class Product {
	int id;
	String title;
	double price;
	
	
	
	public Product() {
		super();
	}

	public Product(int id, String title, double price) {
//		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	public void getDetails(Scanner sc)
	{
		System.out.println("Enter the id");
		id=sc.nextInt();
		System.out.println("Enter the title");
		title=sc.next();
		System.out.println("Enter the price");
		price=sc.nextDouble();
	}
	
	public void displayDetails()
	{
		System.out.println("ID="+id);
		System.out.println("title="+title);
//		System.out.println("price="+price);
	}

	public double discount() {
		return price;
	}
}

