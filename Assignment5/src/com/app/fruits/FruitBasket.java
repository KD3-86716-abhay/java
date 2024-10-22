package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add orange");
		System.out.println("3.Add apple");
		System.out.println("4.Display");
		System.out.println("5.Details of fruit in basket");
		System.out.println("6.Display tastes of stale fruits");
		System.out.println("7.Mark a fruit a stale");
		System.out.println("8.Mark all sour fruits as stale");
		
		System.out.println("Enter your choice");
		return choice=sc.nextInt();
	}
	public static void main(String[] args) {
		
		int basketSize=0;
		int count=0;
		
		int choice;
		
		Scanner sc=new Scanner(System.in);
		
		//enter the basket size
		System.out.println("Enter the basket size");
		basketSize=sc.nextInt();
		
		if(basketSize<=0)
		{
			System.out.println("array is underflow");
			sc.close();
			return;
		}
		
		
		Fruit[] basket=new Fruit[basketSize];
		
		
		while((choice=menu(sc))!=0)
		{
			switch(choice)
			{
			case 0:
				System.out.println("Program finished.......");
				sc.close();
				break;
				
			case 1:
				if(count>=basketSize)
				{
					System.out.println("Basket is full");
					
//				basket[count++] =new Apple(color,weight,name,true);
				}
				else {
                    System.out.println("Enter Mango name:");
                    String name = sc.next();
                    System.out.println("Enter Mango color:");
                    String color = sc.next();
                    System.out.println("Enter Mango weight:");
                    double weight = sc.nextDouble();
                    basket[count++] = new Apple( color, weight,name, true);
                    System.out.println("Apple added to the basket.");
                }
				break;
			
			case 2:
				if(count>=basketSize)
				{
					System.out.println("Basket is full");
					
//				basket[count++] =new Apple(color,weight,name,true);
				}
				else {
                    System.out.println("Enter Orange name:");
                    String name = sc.next();
                    System.out.println("Enter Orange color:");
                    String color = sc.next();
                    System.out.println("Enter Orange weight:");
                    double weight = sc.nextDouble();
                    basket[count++] = new Orange( color, weight,name, true);
                    System.out.println("Apple added to the basket.");
                }
				
				break;
				
			case 3:
				if(count>=basketSize)
				{
					System.out.println("Basket is full");
					
//				basket[count++] =new Apple(color,weight,name,true);
				}
				else {
                    System.out.println("Enter Apple name:");
                    String name = sc.next();
                    System.out.println("Enter Apple color:");
                    String color = sc.next();
                    System.out.println("Enter Apple weight:");
                    double weight = sc.nextDouble();
                    basket[count++] = new Apple( color, weight,name, true);
                    System.out.println("Apple added to the basket.");
                }
				
				break;
				
			case 4: 
                System.out.println("\nFruits in the basket:");
                for (Fruit fruit : basket) {
                    if (fruit != null) {
                        System.out.println(fruit);
                        System.out.println(" ");
                    }
                }
                break;
			case 5:
				System.out.println("Details of fresh fruits:");
                for (Fruit fruit : basket) {
                    if (fruit != null && fruit.isFresh()) {
                        System.out.println(fruit.toString());
                        System.out.println("Taste: " + fruit.taste());
                    }
                }
				break;
				
			case 6: // Display tastes of stale fruits
                System.out.println("Tastes of stale fruits:");
                for (Fruit fruit : basket) {
                    if (fruit != null && !fruit.isFresh()) {
                        System.out.println("Taste of " + fruit.getName() + ": " + fruit.taste());
                    }
                }
                break;

            case 7: // Mark a fruit as stale by index
                System.out.println("Enter the index of the fruit to mark as stale (0 to " + (basketSize - 1) + "):");
                int index = sc.nextInt();
                if (index >= 0 && index < count) {
                    basket[index].setFresh(false);
                    System.out.println(basket[index].getName() + " is now marked as stale.");
                } else {
                    System.out.println("Invalid index!");
                }
                break;

            case 8: // Mark all sour fruits as stale
                System.out.println("Marking all sour fruits as stale:");
                for (Fruit fruit : basket) {
                    if (fruit != null && fruit.taste().equals("sour")) {
                        fruit.setFresh(false);
                        System.out.println(fruit.getName() + " is now marked as stale.");
                    }
                }
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
                break;
				
			}
		}
		
	}

}
