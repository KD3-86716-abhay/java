package com.sunbeam.Assignment7;

class Student implements Comparable<Student>//comparable should be an type of employee
{
	int roll;
	String name;
	String city;
	double marks;

	public Student() {
		super();
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return "roll="+roll+"name="+name+"City="+city+"marks="+marks;	
	}

	@Override
	public int compareTo(Student o) {
		
		return this.roll-o.roll;
	}
//public int compareTo(Student o) {
//		
//		return this.roll-o.roll;
//	}
}


