package edu.austincc.yatzee;

import java.util.Random;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class Die {

	/**
	 * Return a random integer between 1 and 6
	 * 
	 * @return randomNum
	 */
	public int roll() {
		 Random r = new Random();
		 return r.nextInt(6) + 1;
	}
	
}
