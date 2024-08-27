package com.gentech.program.assignment;
class IsPrimeCount
{
	void isprime()
	{
		int count=0;
		for(int num=50;num<=150;num++)
		
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
				 count++;
				
				}
		}
	
		System.out.println(count);
	}
 
}
public class Assign11 
{
	public static void main(String args[])
	{
		IsPrimeCount p=new IsPrimeCount();
		p.isprime();
	}

}
