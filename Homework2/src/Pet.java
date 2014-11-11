/**
 * 
 */

/**
 * @author javauser
 *
 */
public abstract class Pet {
	String name;
	String color;
	int age;
	
	

	/**
	 * @param name
	 * @param color
	 * @param age
	 */
	public Pet(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [name=" + name + ", color=" + color + ", age=" + age + "]";
	}


	public abstract void speak();
	
	public void speak(String saying) {
		System.out.println(saying);
	}
	
	
}
