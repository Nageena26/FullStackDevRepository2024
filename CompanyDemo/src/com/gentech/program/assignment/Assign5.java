package com.gentech.program.assignment;
class Table1To20
{
	void tables()
	{
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++) 
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
			if(i<20)
			{
				System.out.println("--------------------");
			}
			
		}
		 
	}
}

public class Assign5 {

	public static void main(String[] args) {
		Table1To20 t1=new Table1To20();
		t1.tables();

	}

}
