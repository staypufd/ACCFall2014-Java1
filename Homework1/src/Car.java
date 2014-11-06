import java.util.Arrays;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class Car {
	String color;
	int year;
	long miles;
	String make;
	String model;
	Engine engine;
	Tire tires[];
	float gallonsOfGas;
	
	/**
	 * @param color
	 * @param year
	 * @param miles
	 * @param make
	 * @param model
	 * @param engine
	 * @param tires
	 * @param gallonsOfGas
	 */
	public Car(String color, int year, long miles, String make, String model,
			Engine engine, Tire[] tires, float gallonsOfGas) {
		super();
		this.color = color;
		this.year = year;
		this.miles = miles;
		this.make = make;
		this.model = model;
		this.engine = engine;
		this.tires = tires;
		this.gallonsOfGas = gallonsOfGas;
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
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the miles
	 */
	public long getMiles() {
		return miles;
	}
	/**
	 * @param miles the miles to set
	 */
	public void setMiles(long miles) {
		this.miles = miles;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * @return the engine
	 */
//	public Engine getEngine() {
//		return engine;
//	}
	
	
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(GasEngine engine) {
		this.engine = engine;
	}
	/**
	 * @return the tires
	 */
	public Tire[] getTires() {
		return tires;
	}
	/**
	 * @param tires the tires to set
	 */
	public void setTires(Tire[] tires) {
		this.tires = tires;
	}
	/**
	 * @return the gallonsOfGas
	 */
	public float getGallonsOfGas() {
		return gallonsOfGas;
	}
	/**
	 * @param gallonsOfGas the gallonsOfGas to set
	 */
	public void setGallonsOfGas(float gallonsOfGas) {
		this.gallonsOfGas = gallonsOfGas;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [color=" + color + ",\n year=" + year + ",\n miles=" + miles
				+ ",\n make=" + make + ",\n model=" + model + ",\n engine=" + engine
				+ ",\n tires=" + Arrays.toString(tires) + ",\n gallonsOfGas="
				+ gallonsOfGas + "]";
	}

	
	// Behavioral Methods
	public void drive(int numberOfMilesToDrive) {
		long newMiles = this.miles + numberOfMilesToDrive;
		this.setMiles(newMiles);
	}
	
	
	public double calcMPG() {
		return  this.getMiles() / this.getGallonsOfGas();
	}
	
	public void idle() {
		this.engine.howdy();
		this.engine.idle();
	}
}













