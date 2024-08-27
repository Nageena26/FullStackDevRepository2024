package com.gentech.program.assignment2;

class Square1To10
{
	int[] squarenum()
	{
		int sqr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			sqr[i]=(i + 1) * (i + 1);
			
		}
		return sqr;
	}
}
public class Assign6 {

	public static void main(String[] args) {
		Square1To10 s1=new Square1To10();
		int square[]=s1.squarenum();
		for(int i=0;i<square.length;i++)
		{
			System.out.println(square[i]);
		}
		 	

	}

}
