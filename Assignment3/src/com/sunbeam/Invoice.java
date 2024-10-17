package com.sunbeam;

public class Invoice {
String part_no;
String description;
int quantity;
double price;

public Invoice() {
}

public Invoice(String part_no,String description,  int quantity, double price) {
this.part_no=part_no;
this.description=description;
this.quantity=quantity;
this.price=price;
}

public String getPart_no() {
	return this.part_no;
}

public void setPart_no(String part_no) {
	
	this.part_no = part_no;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	if (quantity<0)
	{
		this.quantity=0;
	}
	this.quantity = quantity;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	if(price>0)
	{
		this.price = price;
	}
	
}

//public void display()
//{
//System.out.println("Part_no="+ part_no);
//System.out.println("description=" + description);
//System.out.println("quantity=" + quantity);
//System.out.println("price=" + price);
//}


public void display()
{
System.out.println("Part_no="+ part_no);
System.out.println("description=" + description);
System.out.println("quantity=" + quantity);
System.out.println("price=" + price);
}

public void display(String part_no,String description,  int quantity, int price)
{
System.out.println("Part_no="+ part_no);
System.out.println("description=" + description);
System.out.println("quantity=" + quantity);
System.out.println("price=" + price);
}

public static void main(String[] args) {
		Invoice in=new Invoice();
		in.display();
		in.display("RAM","Memory purpose in comp",1,4500);
		in.setPart_no("abc");
		in.getPart_no();
		System.out.println(in.getPart_no());
}
}
