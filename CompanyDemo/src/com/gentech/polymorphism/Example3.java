package com.gentech.polymorphism;

class Vehicle 
{
    String fuel(String s) 
    {
        return s;
    }
}

class PetrolCar extends Vehicle 
{
    String fuel(String s) 
    {
        return s;
    }
}
  
class ElectricCar extends PetrolCar 
{
    String fuel(String s) 
    {
        return s;
    }
}
public class Example3 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle() ;
		PetrolCar c=new PetrolCar();
		ElectricCar e=new ElectricCar();
		
		v=c;
		String str=v.fuel("Petrol Car");
		System.out.println("Car type: "+str);
		
		v=e;
		String str1=e.fuel("Electric Car");
		System.out.println("Car type: "+str1);
		
	}

}



