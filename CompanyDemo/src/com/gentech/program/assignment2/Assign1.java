package com.gentech.program.assignment2;

class First1DArray
{
	int[] firstHalf(int[] a)
	{
		int res[]=new int[a.length/2];
		for(int i=0;(i<a.length/2);i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Assign1 
{

	public static void main(String[] args) 
	{
		First1DArray a1=new First1DArray();
		int a[]= {1,2,3,4,5,6};
		int c[]=a1.firstHalf(a);
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]+" ");
		}
        
	}
}


