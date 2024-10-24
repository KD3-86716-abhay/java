package com.sunbeam.Assignment7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudCityComparator implements Comparator<Student>
	{

		@Override
		public int compare(Student o1, Student o2) {	
			return o1.city.compareTo(o2.city);
		}	
	}

	class StudMarksDescComparator implements Comparator<Student>
	{
		@Override
		public int compare(Student o1, Student o2) {	
			return Double.compare(o2.marks, o1.marks);
		}	
	}
	
	class StudNameComparator implements Comparator<Student>
	{
		@Override
		public int compare(Student o1, Student o2) {	
			return o1.name.compareTo(o2.name);
		}	
	}
	
	class StudRollComparable implements Comparable<Student>
	{

		private int roll;

		@Override
		public int compareTo(Student o) {
			
			return this.roll-o.roll;
		}
		
	}
	public class program01 {	
	public static int menu(Scanner sc)
	{	
		System.out.println("0. Exit");
		System.out.println("1. Display all Students");
		System.out.println("2. Display all Students on City ");
		System.out.println("3. Display all Students on Marks in descending");
		System.out.println("4. Display all Students on Name");
		System.out.println("5. Display all Students on Marks");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}
	
	public static void  display(Student[] arr)
	{
		System.out.println("*********************************");
		for (Student e :arr)
			System.out.println(e);
			System.out.println();
		System.out.println("*********************************");
	}

	

		
	
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	Student[] arr=new Student[5];
	Comparator <Student> comparator;//reference created
	Comparable <Student> comp;
	arr[0]=new Student(1 ,"Abhay","Pune",75);
	arr[1]=new Student(3 ,"Shree","Chandrapur",40);
	arr[2]=new Student(4 ,"Abhishek","Hyderabad",50);
	arr[3]=new Student(2 ,"MSD","Chennai",60);
	arr[4]=new Student(5 ,"Rohit","Mumbai",80);
	int choice;
	while((choice=menu(sc))!=0)	
	{
		switch(choice)
		{
			case 1:
				display(arr);
				break;
			case 2:
				comparator=new StudCityComparator();
				Arrays.sort(arr,comparator);
				display(arr);
				break;
				
			case 3:
				comparator=new StudMarksDescComparator();
				Arrays.sort(arr,comparator);
				display(arr);
				break;
		
				
			case 4:
				comparator=new StudNameComparator();
				Arrays.sort(arr,comparator);
				display(arr);
				break;
			case 5:
				comp=new StudRollComparable();
				Arrays.sort(arr);
				display(arr);
				break;
				
			default:
				System.out.println("Wrong choice");
	}
		}
	
	
	
	
	
}
}


