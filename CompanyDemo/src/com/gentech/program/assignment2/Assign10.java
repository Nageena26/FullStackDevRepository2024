package com.gentech.program.assignment2;

class Diagonal2DArray
{
	short[][] diagonal(short x[][])
	{
        short[][] diag = new short[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(i==j)
				{
				diag[i][j]=x[i][j];
				}
				else
				{
					diag[i][j]=0;
				}
			}
		}
		return diag;
	}
}

public class Assign10
{

	public static void main(String[] args) 
	{
		Diagonal2DArray a4 = new Diagonal2DArray();
        short[][] x = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        short[][] diagonal1 = a4.diagonal(x);

       
        System.out.println("Diagonal elements:");
        for (int i = 0; i < diagonal1.length; i++) 
        {
            for (int j = 0; j < diagonal1[i].length; j++) 
            {
                if (diagonal1[i][j] == 0)
                {
                    System.out.print("   ");
                }
                else
                {
                	System.out.print(diagonal1[i][j] + " ");
                }
                
            }
            System.out.println();
            
        }
		
        
	}
}
            


