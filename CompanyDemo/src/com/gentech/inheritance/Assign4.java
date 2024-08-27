//Multilevel with parameterized Cons in Super class
package com.gentech.inheritance;

class Animals
{
	String species;
	Animals(String species)
	{
		this.species=species;
	}
	
	void eat()
	{
		
		System.out.println(species+" is Eating");
	}
}

class Mammalss extends Animals
{
	String type;
	Mammalss(String name,String type)
	{
		super(name);
		this.type=type;
	}
	void bloodType()
	{
		
		System.out.println("This "+species+" is "+type);
	}
}

class Dogs extends Mammalss
{
	Dogs(String name,String type)
	{
		super(name,type);
		
	}
	
	void bark(String aName)
	{
		System.out.println(aName+" is an "+species+" and it is "+type);
	}
}

public class Assign4 {

	public static void main(String[] args) {
		Dogs d=new Dogs("Animal","Warm Blooded");
		d.eat();
		d.bloodType();
		d.bark("Dog");
	
	}

}

/* class FactorialExample
{  
	public static void main(String args[])
	{  
		fact=1;  
		int number=Integer.parseInt(args[0]);  
		for(int i=1;i<=number;i++)
		{    
			fact=fact*i;    
		}    
    System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
*/