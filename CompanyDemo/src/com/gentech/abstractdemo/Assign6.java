//Multilevel ,constructor overloading
package com.gentech.abstractdemo;

abstract class Animal6
{
	String species;
	Animal6(String species)
	{
		this.species=species;
	}
	
	Animal6(int year)
	{
		System.out.println("In "+year+" The Zoo Introduced New Animals");
	}
	
	abstract void eat();
	
}

abstract class Mammals6 extends Animal6
{
	String type;
	Mammals6(String name,String type)
	{
		super(name);
		this.type=type;
	}
	
	Mammals6(int year)
	{
		super(year);
	}
	
	
	
	abstract void bloodType();
	
}

class Dog6 extends Mammals6
{
	Dog6(String name,String type)
	{
		super(name,type);
		
	}
	
	Dog6(int year)
	{
		super(year);
		
	}
	
	void eat()
	{
		
		System.out.println(species+" is Eating");
	}
	void bloodType()
	{
		
		System.out.println("This "+species+" is "+type);
	}
	
	void bark(String aName)
	{
		System.out.println(aName+" is an "+species+" and it is "+type);
	}
}

public class Assign6 
{

	public static void main(String[] args) 
	{
		Dog6 d=new Dog6("Animal","Warm Blooded");
		new Dog6(2023);
		d.eat();
		d.bloodType();
		d.bark("Dog");
	
	}

}
