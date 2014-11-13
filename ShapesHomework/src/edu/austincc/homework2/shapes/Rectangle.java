/**
 * 
 */
package edu.austincc.homework2.shapes;

/**
 * @author javauser
 *
 */
public class Rectangle extends Polygon {

	double length;
	double width;
	


	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		super(4);
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		
		return length * width;
	}

	@Override
	public double perimeter() {
		
		return 2 * length + 2 * width;
	}



}
