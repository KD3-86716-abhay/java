package com.sunbeam.p3;

import java.util.Scanner;

public class Tape extends Product{
	String artist;

	public Tape(int id, String title, double price, String artist) {
		super(id, title, price);
		this.artist = artist;
	}
//		@Override
//		public void acceptDetails(Scanner sc) {
//		System.out.println("Enter the id");
//		id=sc.nextInt();
//		System.out.println("Enter the title");
//		title=sc.next();
//		System.out.println("Enter the price");
//		price=sc.nextDouble();
//		}
	
	
	@Override
	public void getDetails(Scanner sc)
	{
		super.getDetails(sc);
		System.out.println("Enter the artist");
		artist=sc.next();
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("artist="+artist);
	}
	
	@Override
	public double discount() {
		
		return price-(price*0.5);
	}
	
}
