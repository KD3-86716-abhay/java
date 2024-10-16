package Assignment1;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		
		double d1,d2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter First double values");
		
		if(sc.hasNextDouble()&&!(sc.hasNextInt())) {
		
		d1=sc.nextDouble();
		System.out.println("enter second double values");
		if(sc.hasNextDouble()&&!(sc.hasNextInt())) {
			d2=sc.nextDouble();
			double sum=d1+d2;
			System.out.println("Sum="+sum);
			double avg=sum/2;
			System.out.println("Average="+avg);
		}
			else {
				System.out.println("the value entered is not double");
			}
		}
		else {
			System.out.println("the value entered is not double");
		}
		sc.close();
		
	}
}
