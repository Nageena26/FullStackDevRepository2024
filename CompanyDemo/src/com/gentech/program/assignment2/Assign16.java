package com.gentech.program.assignment2;

class Reverse2D1Array
{
	double[][] reverse(double x[][])
	{
        double[][] res = new double[x.length][x[0].length];
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				res[i][j]=x[i][j];
			}
		}
		return res;
	}
}

public class Assign16
{

	public static void main(String[] args) 
	{
		Reverse2D1Array a4=new Reverse2D1Array();
		double x[][]= {{1.12,2.12},{3.12,4.12}};
		double c[][]=a4.reverse(x);
		for(int i=0;i<c[i].length;i--)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
        
	}
}


