package com.gentech.program.assignment2;

class Factorial
{
	int factNum(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Assign5 {

	public static void main(String[] args) {
		Factorial f1=new Factorial();
		int num2=Integer.parseInt(args[0]);
		int factorial=f1.factNum(num2);
		System.out.println(factorial);

	}

}
