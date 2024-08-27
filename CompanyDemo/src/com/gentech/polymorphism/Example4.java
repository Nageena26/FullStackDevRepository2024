package com.gentech.polymorphism;

class Employee3
{
    String name;
    double salary;

    Employee3(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() 
    {
    	double ebonus=salary * 0.1;
        return  ebonus;
    }

    String getDetails() 
    {
        return "Employee= " + name+"	" + "Salary= " + salary;
    }
}

class Manager3 extends Employee3
{
    double bonus;

    Manager3(String name, double salary, double bonus) 
    {
        super(name, salary);
        this.bonus = bonus;
    }

    double calculateBonus() 
    {
    	double mbonus=salary * 0.2 + bonus;
        return  mbonus;
    }

   
    String getDetails() 
    {
        return "Manager= " + name +"	"+"Salary= " + salary +"	"+ "Bonus= " + bonus;
    }
}

class Executive3 extends Manager3 
{
    double stockOptions;

    Executive3(String name, double salary, double bonus, double stockOptions) 
    {
        super(name, salary, bonus);
        this.stockOptions = stockOptions;
    }

    double calculateBonus() 
    {
    	double exbonus=salary * 0.3 + bonus + stockOptions;
        return  exbonus;
 
    }

    String getDetails() 
    {
        return "Executive= " + name+"	"+"Salary= " + salary+"	  "+"Bonus" + bonus +"   "+"Stock Options= " + stockOptions;  
    }
}

public class Example4 
{

	public static void main(String[] args) 
	{
	    Employee3 e=new Employee3("Justin",10000);
	    System.out.println(e.getDetails());
	    System.out.println();
	    
		Manager3 m=new Manager3("Jungkook",200000,10000); 
		Executive3 exec = new Executive3("Charlie Puth", 150000.0, 10000.0, 30000.0);
		e=exec;
		System.out.println(e.getDetails());
		  System.out.println();
		
		e=m;
		System.out.println(e.getDetails());
		     
    }
}
