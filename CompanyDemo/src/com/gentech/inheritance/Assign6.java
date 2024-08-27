// Hybrid ,Parameterized super class Constructor
package com.gentech.inheritance;

class Vehicle
{
	String name;
	Vehicle(String name)
	{
		this.name=name;
	}
	
	void vehicleName()
	{
		
		System.out.println(name+" is a Type of Vehicle");
	}
}

class Car extends Vehicle
{

	Car(String name)
	{
		super(name);
	}
	void type(String type)
	{
		
		System.out.println("Porche Taycan is also an "+type+" "+name);
	}
}

class ElectricCar extends Vehicle
{ 
	String carName;
	ElectricCar(String name,String carName)
	{
		super(name);
		this.carName=carName;
	}
	
	void carName()
	{
		System.out.println(carName+" is an Electric "+name);
	}
}

class PetrolCar extends ElectricCar
{
	PetrolCar(String name,String carName)
	{
		super(name,carName);
	}
	
	void names(String Kia)
	{
		System.out.println(Kia+" is a Petrol "+name);	
	}
}
public class Assign6 {

	public static void main(String[] args) {
	
		PetrolCar pc=new PetrolCar("Car","Kia EV6"); 
		pc.vehicleName();
		pc.carName();
		pc.names("Swift");	
		
		Car c=new Car("car");
		c.type("Electric");
		
		
	}

}
