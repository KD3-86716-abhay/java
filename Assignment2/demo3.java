package Assignment1;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
	
	while(true)
	{
	int totalbill=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("**********************************");
	System.out.println("Food Menu");
	System.out.println("1.Dosa");
	System.out.println("2.Samosa");
	System.out.println("3.kachori");
	System.out.println("4.vadapav");
	System.out.println("5.poha");
	System.out.println("6.edli dosa");
	System.out.println("7.pizza");
	System.out.println("8.burger");
	System.out.println("9.French Fries");
	System.out.println("10.Anda Burgi");
	System.out.println("**********************************");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	
	System.out.println("Enter the quantity of");
	int quantity=sc.nextInt();
	switch(choice) 
	{
	case 1:	
		int dosa=30;
		totalbill= dosa * quantity;
		System.out.println("bill="+totalbill);
		break;	
	case 2:	
		int samosa=20;
		totalbill= samosa * quantity;
		System.out.println("bill="+totalbill);
		break;	
	case 3:
	int kachori=30;
	totalbill= kachori * quantity;
	System.out.println("bill="+totalbill);
	break;	
	
	
	case 4:
		int vadapav=20;
		totalbill= vadapav * quantity;
		System.out.println("bill="+totalbill);
		break;	
	
	case 5:
		int poha=30;
		totalbill= poha * quantity;
		System.out.println("bill="+totalbill);
		break;	
	
	case 6:
		int edli_dosa=30;
		totalbill= edli_dosa * quantity;
		System.out.println("bill="+totalbill);
		break;	
	
	case 7:
		int pizza=30;
		totalbill= pizza * quantity;
		System.out.println("bill="+totalbill);
		break;	
		
	case 8:
		int burger=30;
		totalbill= burger * quantity;
		System.out.println("bill="+totalbill);
		break;	
		
	case 9:
		int French_Fries=30;
		totalbill= French_Fries * quantity;
		System.out.println("bill="+totalbill);
		break;	
	
		
	case 10:
		int anda_burgi=30;
		totalbill= anda_burgi * quantity;
		System.out.println("bill="+totalbill);
		break;	
		
		
	}		
	}
	
	}
	
	}	

