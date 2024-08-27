//Hybrid
package com.gentech.inheritance;

class Animal1
{
	String species;
	Animal1(String species)
	{
		this.species=species;
	}
	
	void eat()
	{
		
		System.out.println(species+" are Eating");
	}
}

class Mammals1 extends Animal1
{

	Mammals1(String name)
	{
		super(name);
	}
	void bloodType(String type)
	{
		
		System.out.println("These "+species+" are "+type);
	}
}

class Dog1 extends Animal1
{ 
	String dog;
	Dog1(String name,String dog)
	{
		super(name);
		this.dog=dog;
	}
	
	void bark()
	{
		System.out.println(dog+" are cute "+species);
	}
}

class Cat extends Dog1
{
	Cat(String name,String dog)
	{
		super(name,dog);
	}
	
	void meow(String cat)
	{
		System.out.println(dog+" and "+cat+" are freindly pets");	
	}
}
public class Assign2 
{

	public static void main(String[] args) 
	{
	
		Mammals1 m=new Mammals1("Animals");
		m.eat();
		m.bloodType("Warm Blooded");
		Cat c=new Cat("Amimals","Dogs");
		c.bark();
		c.meow("Cats");
	}

}
