// Multilevel,each class containing same variable name and data type
package com.gentech.inheritance;

class Animal7 {
    String Sound;

    Animal7(String animalSound) {
        this.Sound = animalSound;
    }

    void makeSound(String sound) {
        System.out.println("Animal makes a sound: " +this.Sound);
    }
}

class Bird7 extends Animal7 {
    String Sound;

    Bird7(String animalSound, String birdSound) {
        super(animalSound);
        this.Sound = birdSound;
    }

  
    void makeSound(String sound) {
        super.makeSound(sound);
        System.out.println("Bird chirps: " + this.Sound);
    }
}

class Sparrow7 extends Bird7 {
    String sparrowSound;

    Sparrow7(String animalSound, String birdSound, String sparrowSound) {
        super(animalSound, birdSound);
        this.sparrowSound = sparrowSound;
    }
   
    void makeSound(String sound) {
        super.makeSound(this.Sound);
        System.out.println("Sparrow " +sound+" "+ this.sparrowSound);
    }
}

public class Assign7 {
    public static void main(String[] args) {
       
        Sparrow7 sparrow = new Sparrow7("Generic animal sound", "Chirp sound", "Melodiously");
        sparrow.makeSound("sings");
    }
}

/*package com.gentech.inheritance;

class Animal7 
{
    String sound;
    Animal7(String sound) 
    {
        this.sound = sound;
    }

    void makeSound(String sound) 
    {
        System.out.println("Animal makes a sound: " + this.sound);
    }
}

class Bird7 extends Animal7 
{
    String sound;

    Bird7(String animalSound, String birdSound) 
    {
        super(animalSound);
        this.sound = birdSound;
    }

    void makeSound(String sound) {
        super.makeSound(this.sound);
        System.out.println("Bird chirps: " + this.sound);
    }
}

class Sparrow7 extends Bird7 
{
    String sound;
    Sparrow7(String animalSound, String birdSound, String sound) 
    {
        super(animalSound, birdSound); 
        this.sound = sound;
    }

    void makeSound(String sound) 
    {
        super.makeSound(this.sound);
        System.out.println("Sparrow sings melodiously: " + this.sound);
    }
}


public class Assign7 {
    public static void main(String[] args) {
        Sparrow7 sparrow = new Sparrow7("Generic animal sound", "Bird chirp", "Melodious tune");
        sparrow.makeSound("Special melody");
    }
}
*/


/*class Bird 
{
    void eat(String birds)
    {
        System.out.println("Birds and Their Food Preferences");
        System.out.println("-----------------------------------");
    }
}

class Parrot extends Bird 
{
    void eat(String birds) 
    {
        super.eat(birds);
        System.out.println(birds + " Eats seeds, nuts, fruits, and occasionally insects");
    }
}

class Owl extends Parrot 
{
	
    void eat(String birds) 
    {
        System.out.println(birds + " Eats other animals, from small insects to large birds");
    }
}

public class Assign7 {
    public static void main(String[] args) {
     
        Parrot parrot = new Parrot();
        Owl owl = new Owl();
 
        parrot.eat("1. Parrot");
        System.out.println();
        owl.eat("2. An Owl");
    }
} */
