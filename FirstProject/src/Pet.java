/**
 * 
 */

/**
 * @author javauser
 *
 */
public class Pet {
	// Instance Variables
	String name;
	String kind;

	/**
	 * @param name
	 * @param kind
	 */
	public Pet(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
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

	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [name=" + name + ", kind=" + kind + "]";
	}

	// Behavior
	public void speak(String whatToSay) {
		System.out.println(whatToSay);
	}
	
	public void speak() {
		System.out.println("Howdy!");
	}
}










