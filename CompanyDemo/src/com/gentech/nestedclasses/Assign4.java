package com.gentech.nestedclasses;

class Vehicle
{
	private int vehicleId;
	private String vehicleName;
	
	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	static class Type
	{
		
		static void showType( String type)
		{
			System.out.println(type);
		}
		/* we can directly specify static to the class,variables declared outside the method & the method ..
		(note:in this case do not specify 'static' keyword while assigning values to the static variable inside the static method)
		No need to  create any object inside the main to call the methods
		
		
		static String type;
		static void showType()
		{
			type="Heavy";
			System.out.println(type);
		}	*/
		
	}
	
	static class Capacity
	{
		
	     
		 void showCap(int capacity) /*OR just specify the 'class as static' and write the methods inside it.
			But to access them we have to create an object inside main method and call the methods inside static class  */
		{
			System.out.println(capacity);
		}	
		
	}
	
	
}
public class Assign4
{

	public static void main(String[] args) 
	{
		Vehicle v=new Vehicle();
		
		v.setVehicleId(9087) ;
		v.setVehicleName("Truck");
		
		int Vnum=v.getVehicleId();
		System.out.println(Vnum);
		
		String Vname =v.getVehicleName();
		System.out.println(Vname);
		
		Vehicle.Type.showType("Heavy");
		
		
		Vehicle.Capacity c=new Vehicle.Capacity(); /*OR just specify the 'class as static' and write the methods inside it.
		But to access them we have to create an object inside main method and call the methods inside static class  */
		c.showCap(4);
					
	}
}




