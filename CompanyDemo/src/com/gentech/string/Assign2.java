package com.gentech.string;

public class Assign2 {
	static void reverse()
	{
		String s="nageenA )1";
		char[] arr = s.toCharArray();
		
		for (int i=arr.length-1;i>=0;i--) 
		{
		   System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("------------------------");
	}
	
	static void reverse1()
	{
		String s="nageenA )2";
		for(int i=s.length()-1;i>=0;i--)
		{
			char r=s.charAt(i);
			System.out.print(r);
		}
		System.out.println();
		System.out.println("------------------------");
			    
	}
	
	static void reverse2()
	{
		String s="nageenA )3";
		for(int i=s.length()-1;i>=0;i--)
		{
		String v=s.substring(i,i+1);
		System.out.print(v);
		}		
	}
	
	
	public static void main(String[] args) {
		reverse();
		reverse1();
		reverse2();

	}

}
