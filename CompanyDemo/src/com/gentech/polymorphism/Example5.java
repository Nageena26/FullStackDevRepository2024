package com.gentech.polymorphism;

abstract class BankAccount 
{
   
    abstract String getAccountType();
    static
    {
    	System.out.println("Account Types");
    }
   
    String getAccountDetails() 
    {
    	
        return getAccountType();
    }
}

class SavingsAccount extends BankAccount 
{
    
    String getAccountType() 
    {
        return "1. Savings Account";
    }
}

class CheckingAccount extends BankAccount 
{
   
    String getAccountType() 
    {
        return "2. Checking Account";
    }
}


public class Example5
{
	public static void main(String[] args) 
	{
		BankAccount b=null;
		CheckingAccount c=new  CheckingAccount();
		SavingsAccount s=new SavingsAccount();
		
		b=s;
	    System.out.println(s.getAccountDetails());
		
		b=c;
	    System.out.println(b.getAccountDetails());
	    
	    
    }
}

    