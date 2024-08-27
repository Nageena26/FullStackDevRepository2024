package com.gentech.program.assignment;
class IsPrime
{
	void isprime()
	{
		
		for(int num=1;num<=50;num++)
		
		{   
			
			int i ;
			for( i=2;i<num;i++)
			{
				if(num%i==0)
				{  
					break;
				}
			}
			if(i==num) 
				{
				System.out.println(num+" ");
				
				}
		}
	
		
	}
 
}
public class Assign10 
{
	public static void main(String args[])
	{
		IsPrime p=new IsPrime();
		p.isprime();
	}

}
