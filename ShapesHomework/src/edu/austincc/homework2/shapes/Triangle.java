/**
 * 
 */
package edu.austincc.homework2.shapes;

/**
 * @author javauser
 *
 */
public class Triangle extends Polygon {

	double height;  // Height of Triangle
	
	double sideA;
	double sideB;  // This is the base of the triangle
	double sideC;
	
	/**
	 * @param sides
	 * @param height
	 * @param sideA
	 * @param base  - The base of the triangle (aka sideB)
	 * @param sideC
	 */
	public Triangle(double height, double sideA, double base, double sideC) {
		super(3);
		this.height = height;
		this.sideA = sideA;
		this.sideB = base;
		this.sideC = sideC;
	}

	@Override
	public double area() {
		// 1/2 Base * Height
		double theAnswer = 0.5 * sideB * height;
		return theAnswer;
	}

	@Override
	public double perimeter() {
		return sideA + sideB + sideC;
	}
	

	
	
}
