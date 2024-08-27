//Multilevel
package com.gentech.inheritance;

class Animal
{
	String species;
	Animal(String species)
	{
		this.species=species;
	}
	
	void eat()
	{
		
		System.out.println(species+" is Eating");
	}
}

class Mammals extends Animal
{
	String type;
	Mammals(String name,String type)
	{
		super(name);
		this.type=type;
	}
	void bloodType()
	{
		
		System.out.println("This "+species+" is "+type);
	}
}

class Dog extends Mammals
{
	Dog(String name,String type)
	{
		super(name,type);
		
	}
	
	void bark(String aName)
	{
		System.out.println(aName+" is an "+species+" and it is "+type);
	}
}

public class Assign1 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog("Animal","Warm Blooded");
		d.eat();
		d.bloodType();
		d.bark("Dog");
	
	}

}
