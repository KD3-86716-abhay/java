package com.sunbeam.p1;

import java.util.Scanner;

public class Date {
int day;
int month;
int year;


public Date() {
}

public Date(int day, int month, int year) {
//	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

public void getAcceptDetails(Scanner sc)
{
	System.out.println("Enter day");
	day=sc.nextInt();
	System.out.println("Enter Month");
	month=sc.nextInt();
	System.out.println("Enter year");
	year=sc.nextInt();
}
public String displayDetails()
{
	return day+"/"+ month +"/"+year;
}
}
