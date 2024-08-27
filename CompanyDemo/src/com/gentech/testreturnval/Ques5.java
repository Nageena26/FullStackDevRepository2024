package com.gentech.testreturnval;
class Voting
{
	static boolean isEligible(int age) 
	{
        return age >= 18;
    }
}

public class Ques5 
{
	public static void main(String[] args) 
	{
		    int age=17;
	        boolean eligible = Voting.isEligible(age); 
	        if (eligible) 
	        {
	            System.out.println("The person is eligible for voting as his age is "+age);
	            
	        }

	        else 
	        {
	            System.out.println("The person is not eligible for voting as his age is " +age);
	        }
	}
}



