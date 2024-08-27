package com.gentech.program.assignment2;

class Char2DArray
{
	char[][] charArray(char x[][])
	{
        char[][] res = new char[x.length][x[0].length];
		for(int i=0;i<=0;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				res[i][j]=x[i][j];
			}
		}
		return res;
	}
}

public class Assign7 
{

	public static void main(String[] args) 
	{
		Char2DArray a4=new Char2DArray();
		char x[][]= {{'c','a','t'},{'d','o','g'}};
		char c[][]=a4.charArray(x);
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
			
		}
        
	}
}


