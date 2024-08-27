//Hierarchical
package com.gentech.inheritance;

class Animal2
{
	String species;
	Animal2(String species)
	{
		this.species=species;
	}
	
	void eat()
	{
		
		System.out.println(species+" are Eating");
	}
}

class Mammals2 extends Animal2
{

	Mammals2(String name)
	{
		super(name);
	}
	void bloodType(String type)
	{
		
		System.out.println("These "+species+" are "+type);
	}
}

class Dog2 extends Animal2
{ 
	
	Dog2(String name)
	{
		super(name);	
	}
	
	void bark(String dog)
	{
		System.out.println(dog+" are cute "+species);
	}
}

class Cat2 extends Animal2
{
	Cat2(String name)
	{
		super(name);
	}
	
	void meow(String cat)
	{
		System.out.println(cat+" are also cute "+species);	
	}
}
public class Assign3 
{

	public static void main(String[] args) 
	{
		Mammals2 m=new Mammals2("Animals");
		m.eat();
		m.bloodType("Warm blooded");
		
		Dog2 d=new Dog2("Animals");
		d.bark("Dogs");
		
		Cat2 c=new Cat2("Animals");
		c.meow("Cats");
		

	}

}
