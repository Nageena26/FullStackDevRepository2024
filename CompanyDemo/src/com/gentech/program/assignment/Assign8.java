package com.gentech.program.assignment;
class TableAnyNum
{
	void table(String args[])
	{
		int num=Integer.parseInt(args[0]);
		for(int i=1;i<=10;i++)
		{
			
				System.out.println(num+"*"+i+"="+(num*i));
			
		}
		 
	}
}

public class Assign8 {

	public static void main(String[] args) {
		TableAnyNum t1=new TableAnyNum();
		t1.table(args);

	}

}
