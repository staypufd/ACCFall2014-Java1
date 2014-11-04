/**
 * 
 */

/**
 * @author javauser
 *
 */
public class Person {
	
	// Instance Variables
	int age;
	String name;
	Pet pet;
	String mySaying;

	// Constructor
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Person(int age, String name, String saying) {
		super();
		this.age = age;
		this.name = name;
		this.mySaying = saying;
	}
	
	public Person() {
		super();
		this.age = 0;
		this.name = "No Name";
		this.mySaying = "No Saying";
	}

	/**
	 * @return the pet
	 */
	public Pet getPet() {
		return pet;
	}


	/**
	 * @param pet the pet to set
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	public void speak() {
		if (this.mySaying != null) {
			System.out.println(mySaying);
		} else {
			System.out.println("Wow, the weather is cool!");
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", pet=" + pet
				+ ", mySaying=" + mySaying + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p = new Person(47, "Sam");
		Person p2 = new Person(33, "Tommy", "Rad man!");
		Person p3 = new Person(12, "Billy", "Pokimon Are Cool!");
		

	    Pet myPet = new Pet("Smoochee", "Cat");

		p.setPet(myPet);

		System.out.println(p);
		System.out.println(p2);

		p.setAge(19);
		System.out.println(p);
		
	    myPet.speak("Woof!");
	    myPet.speak();

		System.out.println(p.getAge() < p2.getAge());

		p.speak();
		p2.speak();
		
		System.out.println("Done");
	}

}











