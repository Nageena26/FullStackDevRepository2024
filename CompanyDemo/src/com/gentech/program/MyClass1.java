package com.gentech.program;
class DivisibleBy6
{
	void divisible()
	{    
		int count=0;
		for(int i=50;i<=150;i++)
		{
			if(i%6==0)
			{
			count=count+1;
			}
		}
	   System.out.println("Count="+count);
	}
}



public class MyClass1 {

	public static void main(String[] args) {
		DivisibleBy6 o1=new DivisibleBy6();
		o1.divisible();
		

	}

}
