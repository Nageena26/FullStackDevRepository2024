package com.gentech.program;
class ConcatArray
{   
	
	void twod(char a[][])
	{   
		String space=" ";
		for(int i=0;i<=0;i++)
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+space);
			}
		}
	}
}

public class MyClass4 {

	public static void main(String[] args) {
		char b[][]= {{'1','2','3'},{'4','5','6'}};
		ConcatArray o5=new ConcatArray();
		o5.twod(b);
		
	}

}
