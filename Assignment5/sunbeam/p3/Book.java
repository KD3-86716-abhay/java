package com.sunbeam.p3;

import java.util.Scanner;

public class Book extends Product{

	String author;
	public Book() {
		super();
	}
	public Book(int id, String title, double price, String author) {
		super(id, title, price);
//		this.id=id;
//		this.title=title;
//		this.price=price;
		this.author = author;
	}
	
	public void acceptDetails(Scanner sc) {
	System.out.println("Enter the id");
	id=sc.nextInt();
	System.out.println("Enter the title");
	title=sc.next();
	System.out.println("Enter the price");
	price=sc.nextDouble();
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println(discount());
		
	}
	
	@Override
	public double discount()
	{
		return price-(price*0.10);
	
	}
	
	
	
	
}
