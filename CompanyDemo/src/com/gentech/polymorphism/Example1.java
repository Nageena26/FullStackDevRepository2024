package com.gentech.polymorphism;
class Animal 
{
    void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal 
{   
    void sound() 
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal 
{   
    void sound() 
    {
        System.out.println("Cat meows");
    }
}


public class Example1 {

	public static void main(String[] args) {
		Animal a=new Animal();  
		
		
									    /* Animal a[]= {new Dog(),new Cat()};
		                                for (Animal sound : a) 
		                                {
		                                	sound.sound();
		                                }
		                                */
		a.sound();
		
		Dog d = new Dog(); 
        Cat c =new Cat(); 
        
        a=c;
        a.sound();
        
        a=d;
        a.sound();

       
	}

}







