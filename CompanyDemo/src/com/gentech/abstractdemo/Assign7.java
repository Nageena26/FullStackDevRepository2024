package com.gentech.abstractdemo;
class Calculator {
  
    int calculate(int a, int b) {
        return a + b; 
    }
}


class AdvancedCalculator extends Calculator {
   
    int calculate(int a, int b) {
        return a - b; 
    }
}


public class Assign7 {
    public static void main(String[] args) {
       
        Calculator basicCalc = new Calculator();
       
        AdvancedCalculator advancedCalc = new AdvancedCalculator();

    
        int basicResult = basicCalc.calculate(10, 5);
        System.out.println("Addition result: " + basicResult); 

    
        int advancedResult = advancedCalc.calculate(10, 5);
        System.out.println("Subtraction result: " + advancedResult); 
    }
}
