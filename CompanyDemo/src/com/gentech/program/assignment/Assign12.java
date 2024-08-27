package com.gentech.program.assignment;
class IsPrimeSum
{
	void isprime()
	{
		int sum=0;
		for(int num=1;num<=100;num++)
		
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
				 sum=sum+num;
				
				}
		}
	
		System.out.println(sum);
	}
 
}
public class Assign12 
{
	public static void main(String args[])
	{
		IsPrimeSum p=new IsPrimeSum();
		p.isprime();
	}

}
