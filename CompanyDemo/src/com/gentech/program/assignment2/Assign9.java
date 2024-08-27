package com.gentech.program.assignment2;
class TableAny
{
	int[] tableSeven(int num)
	{
		int[] table = new int[10];
		for(int i=1;i<10;i++)
		{
			table[i] = num * (i + 1);
		}
		return table;
	} 
}

public class Assign9
{

	public static void main(String[] args) 
	{
		TableAny t1=new TableAny();
		int num=Integer.parseInt(args[0]);
		int b[]=t1.tableSeven(num);
		for (int i = 0; i<b.length ; i++) 
		{
			
            System.out.println(num+"x " + (i + 1) + " = " + b[i]);
		}
		

	}

} 
