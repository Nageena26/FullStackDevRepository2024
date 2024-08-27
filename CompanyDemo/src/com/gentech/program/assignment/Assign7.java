package com.gentech.program.assignment;
class SumOfDigits
{   
	void sumdigits(String args[])
	{   
		int sum=0;
		int num=Integer.parseInt(args[0]);
		int tempnum=num; 
	
		while(tempnum>0)
		{
			sum=sum+(tempnum%10);
			tempnum=tempnum/10; 	
		}
		
		System.out.println(sum);
		
	}
}

public class Assign7
{

	public static void main(String[] args) 
	{
		SumOfDigits s1=new SumOfDigits();
		s1.sumdigits(args);
	}

}
