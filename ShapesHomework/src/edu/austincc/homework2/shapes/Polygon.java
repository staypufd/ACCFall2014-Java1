/**
 * 
 */
package edu.austincc.homework2.shapes;

/**
 * @author javauser
 *
 */
public abstract class Polygon extends TwoDShape {
	protected int sides;

	/**
	 * @param sides
	 */
	protected Polygon(int sides) {
		super();
		this.sides = sides;
	}

	
}
