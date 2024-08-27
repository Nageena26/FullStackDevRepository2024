package com.gentech.program.assignment;
class NumOfDigits
{   
	
	void digits(String args[])
	{
		int num=Integer.parseInt(args[0]);
		if((num>=0) && (num<=9) )
		{
			System.out.println(num+"is Single a Digit Number");
		}
		else if((num>=10) && (num<=99) )
		{
			System.out.println(num+" Is a Double Digit Number ");
		}
		else if((num>=100) && (num<=999) )
		{
			System.out.println(num+" Is a Three Digit Num ");
		}
		else if((num>=1000) && (num<=9999) )
		{
			System.out.println(num+" Is a Four Digit Num ");
		}
		else
		{
			System.out.println(num+" Is having 5 or more Digits ");
		}

	}
}

public class Assign6 
{

	public static void main(String[] args) 
	{
		NumOfDigits d1=new NumOfDigits();
		d1.digits(args);
	}

}
