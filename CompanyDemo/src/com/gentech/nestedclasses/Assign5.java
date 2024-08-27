package com.gentech.nestedclasses;
class Jk
{
	static String subject;
	static int[] arrayAddition(int a[])
	{
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Assign5 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]=Jk.arrayAddition(a);
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum=sum+b[i];
		}
		System.out.println(sum);
			
		
	}

}
