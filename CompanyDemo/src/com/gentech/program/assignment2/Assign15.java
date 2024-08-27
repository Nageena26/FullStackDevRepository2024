package com.gentech.program.assignment2;

class OddNumFind1 {
    int[] oddFind() {
        int[] res = new int[25];
        for (int i = 0; i < 25; i++) 
        {
        	res[i] = (2 * i) + 1;
        }
        return res;
    }
}

public class Assign15 
{
    public static void main(String[] args) 
    {
        OddNumFind1 o1 = new OddNumFind1();
        int[] find = o1.oddFind();
        for (int i = 0; i < find.length; i++) 
        {
            System.out.println(find[i]);
        }
    }
}
