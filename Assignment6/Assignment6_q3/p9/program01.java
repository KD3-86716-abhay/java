package com.sunbeam.p9;

import java.util.Scanner;

public class program01 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string want to reverse");
			String name=sc.nextLine();
			
			StringBuilder sb=new StringBuilder(name);
			String rev= sb.reverse().toString();
			System.out.println("Reverse= "+rev);
			
			if(name.equals(rev))//instead of == use equals to to check value inside it
			{
				System.out.println("String is palindrome");
			}else
			{
				System.out.println("String is not palindrome");
			}
				
			
			
			
		}
	}

