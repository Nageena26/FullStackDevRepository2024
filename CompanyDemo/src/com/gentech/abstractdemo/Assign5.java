//Multilevel, Abstract methods
package com.gentech.abstractdemo;

abstract class Animal5
{
	String species;
	Animal5(String species)
	{
		this.species=species;
	}
	
	abstract void eat();
	
}

 abstract class Mammals5 extends Animal5
{
	String type;
	Mammals5(String name,String type)
	{
		super(name);
		this.type=type;
	}
	
	
	
	abstract void bloodType();
	
}

class Dog5 extends Mammals5
{
	Dog5(String name,String type)
	{
		super(name,type);
		
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

public class Assign5 
{

	public static void main(String[] args) 
	{
		Dog5 d=new Dog5("Animal","Warm Blooded");
		d.eat();
		d.bloodType();
		d.bark("Dog");
	
	}

}
