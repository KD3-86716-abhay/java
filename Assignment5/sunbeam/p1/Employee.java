package com.sunbeam.p1;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	car car;
	Date doj;
	{
		doj=new Date();
	}
	public Employee() {
//		super();
	}
	public Employee(int empid, String name, double salary, int day,int month,int year) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		doj.day = day;
		doj.month = month;
		doj.year = year;
	}
	
	public void getAcceptDetails(Scanner sc)
	{
		System.out.println("Enter empid");
		empid=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextInt();
	}
	
	public void displayDetails()
	{
		System.out.println("empid="+empid);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
		if (car!=null)
		{
			car.displayCar();
		}
		
	}
	public void setCar(car car)
	{
	this.car=car;	
	}
}
