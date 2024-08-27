package com.gentech.testreturnval;
class table
{
	static int tab(int num)
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum+=num*i;
		}
		return sum;
	}
}
public class Ques7 {
	public static void main(String[] args) {
		int res=table.tab(2);
		System.out.println("the sum: "+res);

	}

}