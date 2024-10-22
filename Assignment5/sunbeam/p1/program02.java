package com.sunbeam.p1;

import java.util.Scanner;

public class program02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Date d=new Date();
//		d.getAcceptDetails(sc);
//		System.out.println(d.displayDetails());
		
		
		Employee e=new Employee();
		e.getAcceptDetails(sc);
//		e.displayDetails();

		car c = new car();
		c.acceptCar(sc);
		e.setCar(c);
		e.displayDetails();
		
	}
}
