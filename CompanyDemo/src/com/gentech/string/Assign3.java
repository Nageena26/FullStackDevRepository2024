package com.gentech.string;

public class Assign3 {
	static void replace()
	{
		String s="nageenA )1";
        String replaceThis = " )1";
        String byThis = "jk";


        StringBuilder sb = new StringBuilder(s);
        
        int startIndex=sb.indexOf(replaceThis);
        int endIndex = s.length();
        
        sb.delete(startIndex, endIndex);
        
        sb.insert(startIndex, byThis);
        
        String result = sb.toString();
        
        System.out.println("Original String: " + s);
        System.out.println("Modified String: " + result);
	}

	public static void main(String[] args) {
		replace();

	}

}
