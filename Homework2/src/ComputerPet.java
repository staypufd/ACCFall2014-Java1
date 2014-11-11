/**
 * 
 */

/**
 * @author javauser
 *
 */
public class ComputerPet extends Pet {

	int voltage;
	int pixelHeight;
	int pixelWidth;
	String manufacturer;

	
	

	// Getters and Setters

	/**
	 * @param name
	 * @param color
	 * @param age
	 * @param voltage
	 * @param pixelHeight
	 * @param pixelWidth
	 * @param manufacturer
	 */
	public ComputerPet(String name, String color, int age, int voltage,
			int pixelHeight, int pixelWidth, String manufacturer) {
		super(name, color, age);
		this.voltage = voltage;
		this.pixelHeight = pixelHeight;
		this.pixelWidth = pixelWidth;
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the voltage
	 */
	public int getVoltage() {
		return voltage;
	}

	/**
	 * @param voltage the voltage to set
	 */
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	/**
	 * @return the pixelHeight
	 */
	public int getPixelHeight() {
		return pixelHeight;
	}

	/**
	 * @param pixelHeight the pixelHeight to set
	 */
	public void setPixelHeight(int pixelHeight) {
		this.pixelHeight = pixelHeight;
	}

	/**
	 * @return the pixelWidth
	 */
	public int getPixelWidth() {
		return pixelWidth;
	}

	/**
	 * @param pixelWidth the pixelWidth to set
	 */
	public void setPixelWidth(int pixelWidth) {
		this.pixelWidth = pixelWidth;
	}

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

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ComputerPet [voltage=" + voltage + ", pixelHeight="
				+ pixelHeight + ", pixelWidth=" + pixelWidth
				+ ", manufacturer=" + manufacturer + ", name=" + name
				+ ", color=" + color + ", age=" + age + "]";
	}

	// Behavior
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("101001000111");
	}

	/* (non-Javadoc)
	 * @see Pet#speak(java.lang.String)
	 */
	@Override
	public void speak(String saying) {
		// TODO Auto-generated method stub
		super.speak(saying);
		if (this.name.equalsIgnoreCase("Tron")) {
			System.out.println("Computers are the top of the food chain!");
		}
	}
	
	

}


