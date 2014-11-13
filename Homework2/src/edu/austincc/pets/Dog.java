package edu.austincc.pets;
/**
 * 
 */

/**
 * @author javauser
 *
 */
public class Dog extends Pet {
	String breed;
	String temperment;

	

	/**
	 * @param name
	 * @param color
	 * @param age
	 * @param breed
	 * @param temperment
	 */
	public Dog(String name, String color, int age, String breed,
			String temperment) {
		super(name, color, age);
		this.breed = breed;
		this.temperment = temperment;
	}

	// Getters and Setters
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the temperment
	 */
	public String getTemperment() {
		return temperment;
	}

	/**
	 * @param temperment the temperment to set
	 */
	public void setTemperment(String temperment) {
		this.temperment = temperment;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", temperment=" + temperment + ", name="
				+ name + ", color=" + color + ", age=" + age + "]";
	}

	// Behavior
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Woof! Woof!");
	}
	
	
}
