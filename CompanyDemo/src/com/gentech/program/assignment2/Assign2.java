package com.gentech.program.assignment2;

class Sum1DArray
{
	int[] sumArray(int a[])
	{
		int res[]=new int[a.length/2];
		for(int i=0;i<a.length;i++)
		{
			
			res[i]=a[i];
		}
		return res;
	}
}
public class Assign2 {

	public static void main(String[] args) {
		Sum1DArray a2=new Sum1DArray();
		int a[]= {1,2,3,4};
		int b[]=a2.sumArray(a);
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
		}
		System.out.println("Sum of all the elements from the Array is "+sum);

	}

}
