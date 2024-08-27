package com.gentech.program.assignment2;
class Table7
{
	int[] tableSeven(int num)
	{
		int[] table = new int[10];
		for(int i=0;i<10;i++)
		{
			table[i] = num * (i + 1);
		}
		return table;
	} 
}

public class Assign8 
{

	public static void main(String[] args) 
	{
		Table7 t1=new Table7();
		int b[]=t1.tableSeven(7);
		for (int i = b.length-1; i>=0 ; i--) 
		{
			
            System.out.println("7 x " + (i + 1) + " = " + b[i]);
		}
		

	}

} 
