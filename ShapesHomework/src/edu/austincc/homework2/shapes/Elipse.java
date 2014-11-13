/**
 * 
 */
package edu.austincc.homework2.shapes;

/**
 * @author javauser
 *
 */
public class Elipse extends TwoDShape {
	double x_distance;
	double y_distance;
	
	/**
	 * @param x_distance
	 * @param y_distance
	 */
	public Elipse(double x_distance, double y_distance) {
		super();
		this.x_distance = x_distance;
		this.y_distance = y_distance;
	}
	
	@Override
	public double area() {
		double theArea;
		
		theArea = Math.PI * x_distance * y_distance;
		
		return theArea;
	}
	@Override
	public double perimeter() {
		double thePerim;
		
		// Uses equiation for perimeter of elipse from this site:
		// http://www.mathsisfun.com/geometry/ellipse.html
		thePerim = 2 * Math.PI * Math.sqrt( (Math.pow(x_distance, 2) + Math.pow(y_distance, 2)) / 2.0 );
		
		return thePerim;
	}

	
	
}










