//Static Block
package com.gentech.abstractdemo;
abstract class Animal1
{
	
	static 
	{
		System.out.println("Very common Species In animals Are Homo Sapiens and Formicidae");
	}
	
	static 
	{
		System.out.println("Very common Species In animals Are Homo Sapiens and Formicidae");
	}
			
}

class Birds1 extends Animal1
{
	void birds()
	{
		
		System.out.println("Very common Species In Birds Are Passer Domesticus And Sturnus ");
		
	}
	
}

public class Assign2 {

	public static void main(String[] args) {
		
		Birds1 n=new Birds1();
		n.birds();
	}

}
