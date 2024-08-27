package com.gentech.program.assignment;

class BoolOneDArray
{
	void bonearray(boolean a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}

public class Assign2 
{

	public static void main(String[] args) 
	{
		boolean b[]= {true,false,true,true};
		BoolOneDArray arr1=new BoolOneDArray();
		arr1.bonearray(b);

	}

}
