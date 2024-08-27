package com.gentech.program.assignment;

class IntSumTwoDArray
{
	void sumarray(int a[][])
	{
		int sum=0;
		for(int i=1;i<=1;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				
			}
			System.out.print(sum+" ");
		}
		
	}
}

public class Assign4
{

	public static void main(String[] args) 
	{
		int a[][]= {
				    {1,2,3},
				    {4,5,6},
				    {7,8,9}
				   };
		IntSumTwoDArray arr3=new IntSumTwoDArray();
		arr3.sumarray(a);

	}

}
