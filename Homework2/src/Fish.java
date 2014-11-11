/**
 * 
 */

/**
 * @author javauser
 *
 */
public class Fish extends Pet {
	int fins;
	int gills;
	
	
	
	
	/**
	 * @param name
	 * @param color
	 * @param age
	 * @param fins
	 * @param gills
	 */
	public Fish(String name, String color, int age, int fins, int gills) {
		super(name, color, age);
		this.fins = fins;
		this.gills = gills;
	}

	// Getters and Setters
	/**
	 * @return the fins
	 */
	public int getFins() {
		return fins;
	}

	/**
	 * @param fins the fins to set
	 */
	public void setFins(int fins) {
		this.fins = fins;
	}

	/**
	 * @return the gills
	 */
	public int getGills() {
		return gills;
	}

	/**
	 * @param gills the gills to set
	 */
	public void setGills(int gills) {
		this.gills = gills;
	}	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fish [fins=" + fins + ", gills=" + gills + ", name=" + name
				+ ", color=" + color + ", age=" + age + "]";
	}

	// Behavior
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Gurble, Gurble");
		
		if (this.name.equalsIgnoreCase("Judy")) {
			System.out.println("Bow to me stud puppets!");
		}
	}
	

}










