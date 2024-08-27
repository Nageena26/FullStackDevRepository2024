package com.gentech.string;

public class Assign7 {
	
	static void length()
	{
		 String str = "PROGRAM";
		 for (int i = 1; i <= str.length(); i++) 
	        {
	            // Print the substring from the start up to the current length
	            System.out.println(str.substring(0, i));
	        }
	        // Loop through each length from 1 to the length of the string
	        for (int i = str.length()-1; i >=1; i--) 
	        {
	            // Print the substring from the start up to the current length
	            System.out.println(str.substring(0, i));
	        }
	}
	

	public static void main(String[] args) 
	{
		length();

	}

}
