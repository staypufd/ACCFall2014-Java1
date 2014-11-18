/**
 * 
 */
package edu.austincc.yatzee.game;

import java.io.Serializable;

import edu.austincc.yatzee.Die;

/**
 * @author javauser
 *
 */
public class App implements Serializable  {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Die die1 = new Die();
		Die die2 = new Die();
		
		for (long i = 0; i < 200L; i++) {
			int d1Num = die1.roll();
			int d2Num = die2.roll();
			
			// System.out.println("You rolled " + d1Num + " and " + d2Num);
		}
		
		System.out.println("Done");
		System.out.println("\u2248");
		// System.out.println("≈");
	}

}
