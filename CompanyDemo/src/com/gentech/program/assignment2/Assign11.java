package com.gentech.program.assignment2;

class ConcatStringArray
{   
	
	String[] oned(String a[])
	{   
		String res[]=new String[a.length];
		String space=" ";
		for(int i=0;i<a.length;i++)
		{
			res[i]=space+a[i]; 
		}
		return res;
	}
	
}

public class Assign11 {

	public static void main(String[] args) {
	
		ConcatStringArray c1=new ConcatStringArray();
		String b[]= {"Hello","My","Name","is","Nageena"};
		String c[]=c1.oned(b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	
	}

}
