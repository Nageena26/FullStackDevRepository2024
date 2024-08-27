package com.gentech.program.assignment2;

class Reverse2DArray
{
	double[][] reverse(double x[][])
	{
        double[][] res = new double[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				res[i][j]=x[i][j];
			}
		}
		return res;
	}
}

public class Assign4 
{

	public static void main(String[] args) 
	{
		Reverse2DArray a4=new Reverse2DArray();
		double x[][]= {{1.12,2.12},{3.12,4.12}};
		double c[][]=a4.reverse(x);
		for(int i=c.length-1;i>=0;i--)
		{
			for(int j=c[i].length-1;j>=0;j--)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
        
	}
}


