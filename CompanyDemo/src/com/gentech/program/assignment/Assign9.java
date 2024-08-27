package com.gentech.program.assignment;
class CubeOneDArray
{
	void cube(int a[])
	{
		int cube;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			cube=a[i]*a[i]*a[i];
			count++;
			System.out.println(count+")"+" Cube Of "+a[i]+" is "+cube);
		}
		
	}
}

public class Assign9 
{

	public static void main(String[] args) 
	{
		int b[]= {1,2,3,4,5};
		CubeOneDArray arr=new CubeOneDArray();
		arr.cube(b);
	
	}

}
