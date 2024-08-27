package com.gentech.program;

class Country 
{
	String countryName;
	String continent;
}

class State 
{
	String stateName;
}

class District
{
	String districtName;
}

class Village
{
	String villageName;
	int pin;
}


public class Demo2Main 
{

	public static void main(String[] args) 
	{
		Country cname=new Country();
		State sname=new State();
		District dname=new District();
		Village vname=new Village();
		
		cname.countryName="India";
		cname.continent="Asia";
		System.out.println("Country Name: "+cname.countryName);
		System.out.println("Continent   : "+cname.continent);
		System.out.println("-------------------------");
		
		sname.stateName="Karnataka";
		System.out.println(sname.stateName+" is a State in "+cname.countryName);
		System.out.println("-------------------------");
		
		dname.districtName="Bangalore";
		System.out.println(dname.districtName+" is a District in "+sname.stateName);
		System.out.println("-------------------------");
		
		vname.villageName="jakkur";
		vname.pin=560064;
		System.out.println(vname.villageName+" is a Village in "+dname.districtName);
		System.out.println("-------------------------");
				
	}

}
