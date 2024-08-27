//Return value
package com.gentech.abstractdemo;
abstract class Addition
{
	abstract int[] Fsound(int []a);
}

class Subtraction extends Addition
{
	int[] Fsound(int []a)
	{
		int res[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			res[i]=a[i];
		}
		return res;
	}
	
}

public class Assign4 {
	public static void main(String[] args) 
	{
		Subtraction s=new Subtraction();
		int a[]= {1,2,3,4};
		int c[]=s.Fsound(a);
		int sum=0;
		for(int j=0;j<c.length;j++)
		{
			sum=sum+c[j];
		}
		System.out.println(sum);
	}
}
	