/**
 * 
 */
package edu.austincc.homework2.shapes;

/**
 * @author javauser
 *
 */
public class Rhombus extends Polygon {

	double sideLength;
	double altitude;

	/**
	 * @param sideLength
	 * @param altitude
	 */
	public Rhombus(double sideLength, double altitude) {
		super(4);
		this.sideLength = sideLength;
		this.altitude = altitude;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return sideLength * altitude;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * sideLength;
	}


	


}
