package com.gentech.testreturnval;
class circle
{
    static double area(int radius)
    {
    	double res=3.14 *radius * radius;
        return res;
    }
}

public class Ques4 
{
	public static void main(String[] args) 
	{
		int radius = 5;
        double areaCircle = circle.area(radius);
        System.out.println("Area of the circle: " + areaCircle);
    
	}

}

