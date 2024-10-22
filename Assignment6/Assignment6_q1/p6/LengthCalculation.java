package com.sunbeam.p6;
import com.sunbeam.p4.ExceptionLineTooLong;
public class LengthCalculation {
	String message;
	public void LengthCalculation(String message) throws ExceptionLineTooLong
	{	
		if(message.length()>80)
		{
//		System.out.println("The String is too long");
			throw new ExceptionLineTooLong();
		}
		this.message = message;
//		return length ;
	}
}


