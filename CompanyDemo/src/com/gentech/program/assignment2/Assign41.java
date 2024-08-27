package com.gentech.program.assignment2;
class DoubleArray
{
	double[] revOneDArray(double[] a)
	{
		double[] arr=new double[a.length];
		int j=0;
		for(int i=(a.length-1);i>=0;i--)
		{
			arr[j]=a[i];
			j++;
		}
		return arr;
	}
	
}
public class Assign41 {
	public static void main(String[] args) {
		DoubleArray o=new DoubleArray();
		double[] b= {1.0,2.0,3.0,4.0,5.0,6.0};
		double[] c=o.revOneDArray(b);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+ ",  ");
		}
	}

}
