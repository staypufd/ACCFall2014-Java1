/**
 * 
 */

/**
 * @author javauser
 *
 */
public class GasEngine extends Engine {
	int horsepower;
	byte pistonsCount;
	/**
	 * @param horsepower
	 * @param manufacturer
	 * @param pistonsCount
	 */
	public GasEngine(int horsepower, String manufacturer, byte pistonsCount) {
		super();
		this.horsepower = horsepower;
		this.manufacturer = manufacturer;
		this.pistonsCount = pistonsCount;
	}
	/**
	 * @return the horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}
	/**
	 * @param horsepower the horsepower to set
	 */
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	/**
	 * @return the pistonsCount
	 */
	public byte getPistonsCount() {
		return pistonsCount;
	}
	/**
	 * @param pistonsCount the pistonsCount to set
	 */
	public void setPistonsCount(byte pistonsCount) {
		this.pistonsCount = pistonsCount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engine [horsepower=" + horsepower + ", manufacturer="
				+ manufacturer + ", pistonsCount=" + pistonsCount + "]";
	}
	
	// Behavioral Methods aka Instance Methods
	public void idle() {
		System.out.println("Vrrooommmmm!, Vroooommm!");
	}
}




