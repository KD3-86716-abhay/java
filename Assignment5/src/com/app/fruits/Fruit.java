package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit() {
		super();
	}	
	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}	
	
	public String getName() {
        return name;
    }
	
	public String toString()
	{
		return "name="+color+"Weight="+weight+"name="+name+"isFresh="+isFresh;
	}
		
	public abstract String taste();
	
	public boolean isFresh()
	{
		return isFresh;
	}
	
	public void setFresh()
	{
		this.isFresh=isFresh;
	}
	public void setFresh(boolean fresh) {
        isFresh = fresh;
    }
	abstract void accept(Scanner sc);
	
	
	
}
