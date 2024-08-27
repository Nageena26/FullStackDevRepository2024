package com.gentech.polymorphism;

abstract class ArithmeticOperations
{
	abstract int oprations(int x, int y);
}

class Addition extends ArithmeticOperations
{
	int oprations(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
}

class Subtraction extends ArithmeticOperations
{
	int oprations(int x,int y)
	{
		int sub=x-y;
		return sub;
	}
}

class Multiplication extends ArithmeticOperations
{
	int oprations(int x,int y)
	{
		int mul=x*y;
		return mul;
	}
}

class Division extends ArithmeticOperations
{
	int oprations(int x,int y)
	{
		int div=x/y;
		return div;
	}
}


public class Example2 
{

	public static void main(String[] args) 
	{
		ArithmeticOperations ar=null;
		
		Addition a=new Addition();
		Subtraction s= new Subtraction();
		Multiplication m=new Multiplication();
		Division d=new Division();
		
		ar=a;
		int sum=ar.oprations(2,3);
		System.out.println("Addition Result: "+sum);
		
		ar=s;
		int sub=ar.oprations(8,7);
		System.out.println("Subtraction Result: "+sub);
		
		ar=m;
		int mul=ar.oprations(2,7);
		System.out.println("Multiplication Result: "+mul);
		
		ar=d;
		double div=ar.oprations(5,3);
		System.out.println("Division Result: "+div);
			
	}

}
