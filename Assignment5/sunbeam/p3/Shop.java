package com.sunbeam.p3;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		int count=0;
		int choice=0;
		Scanner sc=new Scanner(System.in);
		while ( count < 3)
		{
			System.out.println("1.Add Book");
			System.out.println("2.Add Tape");
			System.out.println("3.Calculate final Bill");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			count++;
		
		
		switch(choice)
		{
		case 1:
			//Add Book
			Book b1=new Book();
			b1.acceptDetails(sc);
//			b1.getDetails(sc);
			b1.displayDetails();
			b1.discount();
			break;
		
		case 2:
			break;
		case 3:
			
			break;
			
		
		
		}
		
		}
		
		
		
		
		

	}

}
