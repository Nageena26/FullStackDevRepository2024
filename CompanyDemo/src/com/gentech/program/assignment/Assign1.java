package com.gentech.program.assignment;
class IntOneDArray
{
	void ionearray(int a[])
	{
		int Sum=0;
		for(int i=0;i<a.length;i++)
		{
			Sum+=a[i];
		}
		System.out.println(Sum);
	}
}

public class Assign1 
{

	public static void main(String[] args) 
	{
		int b[]= {1,2,3,4,5};
		IntOneDArray arr=new IntOneDArray();
		arr.ionearray(b);
	
	}

}
