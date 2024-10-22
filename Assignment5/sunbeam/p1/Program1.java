package com.sunbeam.p1;

class Singleton {
	
	private static Singleton ref=null;//created a static reference of class.
	
	public Singleton ()
	{	
		System.out.println("singleton ctor ");	
	//ctor created	
	}
	public static Singleton getInstance() //the method start with get so must return Singleton  
	{
		System.out.println("singleton ctor ");	
		if (ref == null)
			ref = new Singleton();
		return ref;
	}
	
}
public class Program1{
	
public static void main(String args[])
{
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
}
}