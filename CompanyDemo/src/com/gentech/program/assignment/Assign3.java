package com.gentech.program.assignment;

class IntTwoDArray
{
	void transposearray(int a[][])
	{
		int c[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[j][i];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

public class Assign3 
{

	public static void main(String[] args) 
	{
		int a[][]= {
				    {1,2,3},
				    {4,5,6},
				    {7,8,9}
				   };
		IntTwoDArray arr2=new IntTwoDArray();
		arr2.transposearray(a);

	}

}
