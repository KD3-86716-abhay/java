package com.sunbeam;

public class Employee {
String first_name;
String last_name;
double salary;

public Employee() {
}

public Employee(String first_name, String last_name, double salary) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
	this.salary = salary;
}


public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	if(salary>0)
	{
		this.salary = salary;
	}
	
}

public void display()
{
System.out.println("first_name="+ first_name);
System.out.println("last_name=" + last_name);

System.out.println("salary=" + salary);
}

public void display(String first_name,String last_name, double salary)
{
System.out.println("first_name="+ first_name);
System.out.println("last_name=" + last_name);
System.out.println("salary=" + salary);
}

public static void main(String[] args) {
	Employee e=new Employee();
	e.display();
	e.display("abc","bbc",20000);
	e.setFirst_name("abhay");
	System.out.println(e.getFirst_name());
	e.setLast_name("Siddheshware");
	System.out.println(e.getLast_name());
	e.setSalary(-5000);
	System.out.println(e.getSalary());
	e.setSalary(5000);
	System.out.println(e.getSalary());
}
}
