package com.app.geometry;

import java.util.Scanner;

public class Testpoint {

	public static void main(String[] args) {
		//taking input parameters using scanner class
		Scanner sc=new Scanner(System.in);
		//taking input x1 and y1 from user 
		System.out.println("enter x1 and y1");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		//pass those input parameters to the objects
		Point2D p1=new Point2D(x1,y1);
		//taking input from usaer as x2 & y2
		System.out.println("enter x2 and y2");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		Point2D p2=new Point2D(x2,y2);
		
		System.out.println("getdetails:"+p1.getDetails());
		System.out.println("getdetails:"+p2.getDetails());
		
		boolean isequal=p1.isEqual(p2);//checking condition for is equal
		if(isequal)
		{
			System.out.println("Points are equal");
		}
		else
		{
			System.out.println("Points are not equal");	
		}
		
		double distance=p1.calculateDistance(p2);
		System.out.println("Distance between points"+distance);
	}
}
