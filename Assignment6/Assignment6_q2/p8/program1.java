package com.sunbeam.p8;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string want to reverse");
		String name=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(name);
		String rev= sb.reverse().toString();
		System.out.println("Reverse= "+rev);
	}
}
