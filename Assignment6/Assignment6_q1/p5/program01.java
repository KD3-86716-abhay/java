package com.sunbeam.p5;

import java.util.Scanner;

import com.sunbeam.p4.ExceptionLineTooLong;

public class program01  {

	public static void main(String args[]) throws ExceptionLineTooLong {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.length() > 80) {
			throw new ExceptionLineTooLong("STRING IS TOO LONG");
		
		}
	}
}
