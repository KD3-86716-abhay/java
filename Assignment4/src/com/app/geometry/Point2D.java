package com.app.geometry;

public class Point2D {
	double x;
	double y;
	
	public Point2D() {	
	}
	
	public Point2D(double x, double y) {
		this.x =x ;
		this.y = y;
		
	}
	
	public String getDetails() 
	{
		return "Point coordinates:"+ x + y ;
	}
	
	
//	public int getx1()
//	{
//		return x;
//	}
//	
//	public int gety1()
//	{
//		return y;
//	}
	
	
	public boolean isEqual (Point2D other)
	{
		if ((this.x==other.x) && (this.y==other.y))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double calculateDistance(Point2D other)
	{
		if(this.isEqual(other))
		{
			return 0;
			
		}
		else
		{
			double x3=Math.pow((this.x-other.x), 2);//x3 disance
			double y3=Math.pow((this.y-other.y), 2);//y3 distance
			double distance=Math.sqrt(x3+y3);//calculating distance in squre root by adding x3+y3
			return distance;
		}
	}
	

}
