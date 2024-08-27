package com.gentech.string;

public class Assign6 
{
    static void palindrome() 
    {
        String s = "GADAG";
        StringBuilder sb = new StringBuilder(s);
        String reversedString = sb.reverse().toString();

       
        if (s.equals(reversedString)) 
        {
            System.out.println(s + " is a palindrome");
        } else 
        {
            System.out.println(s + " is not a palindrome");
        }
    }

    public static void main(String[] args) 
    {
    	palindrome();
    }
}
