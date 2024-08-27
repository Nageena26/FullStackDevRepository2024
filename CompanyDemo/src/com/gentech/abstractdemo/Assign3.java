//Instance Block
package com.gentech.abstractdemo;
abstract class Animal2
{
	
	 
	{
		System.out.println("Very common Species In animals Are Homo Sapiens and Formicidae");
	}
		
	
}

class Birds2 extends Animal2
{
	void birds()
	{
		
		System.out.println("Very common Species In Birds Are Passer Domesticus And Sturnus ");
		
	}
	
	
}

public class Assign3 {

	public static void main(String[] args) {
		
		Birds2 n=new Birds2();
		n.birds();
	}

}
