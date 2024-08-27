package com.gentech.program.assignment2;
class Short1Array
{
	short [] secondHalf(short array[])
	{
		short result[]=new short[6];
		for(int i=array.length/2;i<array.length;i++)
		{
			result[i]=array[i];
		}
		return result;
	}
}

public class Assign3 {

	public static void main(String[] args) {
		Short1Array a3=new Short1Array();
		short array[]= {1,2,3,4,5,6};
		short c[]= a3.secondHalf(array);
	    
	    for(int i=0;i<c.length;i++)
	    {
	    	if(c[i]!=0)
	    	{
	    		System.out.print(c[i]+" ");
	    	}
	    	
	    }

	}

}
