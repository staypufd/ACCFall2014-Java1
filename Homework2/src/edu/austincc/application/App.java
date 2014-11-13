package edu.austincc.application;


import edu.austincc.pets.ComputerPet;
import edu.austincc.pets.Dog;
import edu.austincc.pets.Fish;
import edu.austincc.pets.Pet;


/**
 * 
 */

/**
 * @author javauser
 *
 */
public class App {

	public static Float versionNum = 2.0f;
	
	public static String[] colors = { "Red", "Blue", "Green" };
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pet petOne;
		Pet petTwo;
		ComputerPet computerPet;
		
		petOne = new Fish("Bob", "orange", 1, 2, 4);
		petTwo = new Dog("Lassie", "brownish", 4, "Collie", "Angry");
		
		
		computerPet = new ComputerPet("Tron", "blueish", 31, 240, 512, 342, "Apple");
		computerPet.speak();
		
		
		Pet[] morePets = new Pet[10];
		
		morePets[0] = new Fish("Judy", "red", 2, 5, 3);
		morePets[1] = new Fish("Jill", "black", 5, 7, 9);
		morePets[2] = new Fish("Ted", "green", 1, 2, 6);
		
		morePets[3] = new ComputerPet("Tron", "blueish", 31, 240, 512, 342, "Apple");
		morePets[4] = new ComputerPet("Bit", "blueish", 4, 5 , 1920, 1080, "Compaq");
		morePets[5] = new ComputerPet("Byte", "blueish", 23, 240, 512, 342, "Dell");
		morePets[6] = new ComputerPet("Word", "blueish", 60, 240, 512, 342, "IBM");
		
		morePets[7] = new Dog("Lassie", "brownish", 4, "Collie", "Angry");
		morePets[8] = new Dog("Woofie", "yellow", 4, "Pitbull", "Happy");
		morePets[9] = new Dog("Spot", "tan", 4, "Pug", "Sad");
		
		
		for (int i = 0; i < morePets.length; i++) {
			System.out.format("%15s %s  -  ", morePets[i].getClass().getName(), morePets[i].getName());
			morePets[i].speak();
			morePets[i].speak("Rad Dude!");
		}
		
		System.out.println("\n-------------------------------\n");
		
		for (int i = 0; i < morePets.length; i++) {
			System.out.println(morePets[i].getName());
		}
		
		System.out.println("\n-------------------------------\n");
		
		for (int q = 0; q < morePets.length; q++) {
			System.out.println(morePets[q]);
		}
		
		System.out.print("Pet 8 is " );
		System.out.print(morePets[8].getAge());
		System.out.println(" years old.");
		
		
		Object theClass = App.class;
		System.out.println(theClass);
		
	}

}














