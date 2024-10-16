package Assignment1;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//
		System.out.println("Enter any integer number");//accepting one integer value from user
		int a=sc.nextInt();//store user entered value into a variable
		String binary=Integer.toBinaryString(a);//
		String octal=Integer.toOctalString(a);
		String hexadecimal=Integer.toHexString(a);
		System.out.println("binary="+binary);
		System.out.println("octal="+octal);
		System.out.println("hexadecimal="+hexadecimal);
		sc.close();
	}
}
