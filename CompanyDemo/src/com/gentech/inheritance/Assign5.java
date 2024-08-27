//Multilevel Constructor OverLoading
package com.gentech.inheritance;

class Animal3
{
	String species;
	Animal3(String species)
	{
		this.species=species;
	}
	
	Animal3(int year)
	{
		System.out.println("In "+year+" The Zoo Introduced New Animals");
	}
	
	void eat()
	{
		
		System.out.println(species+" is Eating");
	}
}

class Mammals3 extends Animal3
{
	String type;
	Mammals3(String name,String type)
	{
		super(name);
		this.type=type;
	}
	
	Mammals3(int year)
	{
		super(year);
	}
	
	
	void bloodType()
	{
		
		System.out.println("This "+species+" is "+type);
	}
}

class Dog3 extends Mammals3
{
	Dog3(String name,String type)
	{
		super(name,type);
		
	}
	
	Dog3(int year)
	{
		super(year);
		
	}
	
	
	
	void bark(String aName)
	{
		System.out.println(aName+" is an "+species+" and it is "+type);
	}
}

public class Assign5 
{

	public static void main(String[] args) 
	{
		Dog3 d=new Dog3("Animal","Warm Blooded");
		new Dog3(2023);
		d.eat();
		d.bloodType();
		d.bark("Dog");
	
	}

}
