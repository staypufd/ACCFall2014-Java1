/**
 * 
 */

/**
 * @author javauser
 *
 */
public class RocketEngine extends Engine {
  
	int thurst;
	
	
	
	/**
	 * @param manufacturer
	 * @param thurst
	 */
	public RocketEngine(String manufacturer, int thurst) {
		super();
		this.manufacturer = manufacturer;
		this.thurst = thurst;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RocketEngine [manufacturer=" + manufacturer + ", thurst="
				+ thurst + "]";
	}

	/**
	 * @return the thurst
	 */
	public int getThurst() {
		return thurst;
	}

	/**
	 * @param thurst the thurst to set
	 */
	public void setThurst(int thurst) {
		this.thurst = thurst;
	}



	// Behavioral Methods aka Instance Methods
	public void idle() {
		System.out.println("Whhhhooooo");
	}
}
