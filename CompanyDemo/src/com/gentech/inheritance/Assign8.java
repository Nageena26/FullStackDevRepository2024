package com.gentech.inheritance;

class Calculator 
{
    int x, y;

    Calculator(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    
    int add(int x, int y) 
    {
        return x + y;
    }
}


class AdvancedCalculator extends Calculator 
{
	int x,y;
    AdvancedCalculator(int x, int y) 
    {
        super(x, y);
        this.x=x;
        this.y=y;
    }

    int subtract(int x, int y) 
    {
        return x - y;
    }
}


class ScientificCalculator extends AdvancedCalculator 
{
	int x,y;
    ScientificCalculator(int x, int y) 
    {
        super(x, y);
        this.x=x;
        this.y=y;
        
    }

    int multiply(int x, int y) 
    {
        return x * y;
    }
}


public class Assign8 {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator(2, 3);
        
        int multiplicationResult = calc.multiply(2, 3);
        System.out.println("Multiplication result: " + multiplicationResult);
        
        int subtractionResult = calc.subtract(5, 4);
        System.out.println("Subtraction result: " + subtractionResult);
        
        int additionResult = calc.add(2, 3);
        System.out.println("Addition result: " + additionResult);
    }
}

