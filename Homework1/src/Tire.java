/**
 * 
 */

/**
 * @author javauser
 *
 */
public class Tire {
	int treadLife;
	String manufacturer;
	/**
	 * @param treadLife
	 * @param manufacturer
	 */
	public Tire(int treadLife, String manufacturer) {
		super();
		this.treadLife = treadLife;
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the treadLife
	 */
	public int getTreadLife() {
		return treadLife;
	}
	/**
	 * @param treadLife the treadLife to set
	 */
	public void setTreadLife(int treadLife) {
		this.treadLife = treadLife;
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
		return "Tire [treadLife=" + treadLife + ", manufacturer="
				+ manufacturer + "] \n";
	}
	
	
}
