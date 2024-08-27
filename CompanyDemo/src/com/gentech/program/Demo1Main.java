package com.gentech.program;

class TwoWheel 
{
	String modelName;
	int number;
	int capacity;
}

class FourWheel 
{
	String modelName;
	int number;
	int capacity;
}

class HeavyVehicle
{
	String modelName;
	int number;
	int capacity;
}


public class Demo1Main 
{

	public static void main(String[] args) 
	{
		TwoWheel bike=new TwoWheel();
		bike.modelName="Unicorn,Honda";
		bike.capacity=2;
		bike.number=17;	
		System.out.println("Model name: "+bike.modelName);
		System.out.println("Vehicle Number: "+bike.number);
		System.out.println("Capacity: "+bike.capacity);
		System.out.println("-------------------------");
		
		FourWheel car=new FourWheel();
		car.modelName="Porche";
		car.number=56964;
		car.capacity=4;
		System.out.println("Model name: "+car.modelName);
		System.out.println("Vehicle Number: "+car.number);
		System.out.println("Capacity: "+car.capacity);
		System.out.println("-------------------------");
		
		HeavyVehicle truck=new HeavyVehicle();
		truck.modelName="ACE";
		truck.number=569774;
		truck.capacity=6;
		System.out.println("Model name: "+truck.modelName);
		System.out.println("Vehicle Number: "+truck.number);
		System.out.println("Capacity: "+truck.capacity);
		System.out.println("-------------------------");
			
		
	}

}
