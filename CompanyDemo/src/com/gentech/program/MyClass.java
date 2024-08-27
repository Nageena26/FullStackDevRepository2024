package com.gentech.program;
class Sum1To50
{
	void sum()
	{    
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			sum=sum+i;
		}
	   System.out.println("Sum="+sum);
	}
}


public class MyClass {

	public static void main(String[] args) {
		Sum1To50 o=new Sum1To50();
		o.sum();

	}

}
