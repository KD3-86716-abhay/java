package com.sunbeam.p1;

import java.util.Scanner;

public class car {
	String name;
	String no;
	public car() {
//		super();
	}
	public car(String name, String no) {
//		super();
		this.name = name;
		this.no = no;
	}
	public void acceptCar(Scanner sc)
	{
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter no");
		no=sc.next();	
	}
	
	public void displayCar()
	{
		System.out.println("Name="+name);
		System.out.println("Number="+no);
	}
	
	

}
