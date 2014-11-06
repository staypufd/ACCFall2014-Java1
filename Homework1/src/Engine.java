
public abstract class Engine {

	String manufacturer;
	
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	// Behavioral Methods aka Instance Methods
	public abstract void idle();
	
	public void howdy() {
		System.out.println("Howdy from your trusty engine!");
	}
}
