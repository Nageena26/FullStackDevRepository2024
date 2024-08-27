//Multiple Static Methods
package com.gentech.abstractdemo;
abstract class Animal
{
	
	static void showSpecies(String S1,String S2)
	{
		System.out.println("Very common Species In animals Are "+S1+" And "+S2);
	}
	
	static void showNames(String N1,String N2)
	{
		System.out.println(N1+" and "+N2+" belongs to these two species Respectively");
	}
		
		
}
class Birds extends Animal
{
	void showSpecies()
	{
		
		System.out.println("Very common Species In Birds Are Passer Domesticus And Sturnus ");
		
	}
	void showNames()
	{
		System.out.println("Sparrow and Starling belongs to these two species Respectively");
	}
}

public class Assign1 {

	public static void main(String[] args) {
		System.out.println("ANIMALS");
		Birds.showSpecies("Homo Sapiens","Formicidae"); //'showSpecies' and ''showNames are static methods defined in the Animal class. They can be called directly using the class name Birds because static methods belong to the class itself, not instances.
		Birds.showNames("Humans","Ants");// same as above
		System.out.println("----------------------------");
		System.out.println("BIRDS");
		
		Birds b=new Birds();
		b.showSpecies();
		b.showNames();
		

	}

}
