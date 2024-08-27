package com.gentech.testreturnval;
class Rect 
{
    static int area(int length, int width)
    {
        return length * width;
    }
}

public class Ques3 
{
	public static void main(String[] args) 
	{
		int length = 5;
        int width = 3;
        int rectArea = Rect.area(length, width);
        System.out.println("Area of the rectangle: " + rectArea);
    
	}

}

