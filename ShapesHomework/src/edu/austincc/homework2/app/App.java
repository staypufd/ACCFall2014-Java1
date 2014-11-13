package edu.austincc.homework2.app;

import edu.austincc.homework2.shapes.Circle;
import edu.austincc.homework2.shapes.Elipse;
import edu.austincc.homework2.shapes.Rectangle;
import edu.austincc.homework2.shapes.Rhombus;
import edu.austincc.homework2.shapes.Square;
import edu.austincc.homework2.shapes.TwoDShape;
import edu.austincc.homework2.shapes.Polygon;
import edu.austincc.homework2.shapes.Triangle;

public class App {

	public static void main(String[] args) {
	 
		System.out.println("Triangle Man");
		TwoDShape t = new Triangle(4.0, 3, 4, 5);
		System.out.println(t.area());
		System.out.println(t.perimeter());
		
		System.out.println("Square Man");
		TwoDShape s = new Square(4.2);
		System.out.println(s.area());
		System.out.println(s.perimeter());
		
		System.out.println("Rhombus Man");
		TwoDShape r = new Rhombus(5.3, 8.2);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
		System.out.println("Circle Man");
		TwoDShape c = new Circle(4.2);
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
		System.out.println("Rectangle Man");
		TwoDShape rect = new Rectangle(8.1, 2.3487);
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		
		System.out.println("Elipse Man");
		TwoDShape e = new Elipse(4.8, 9.2);
		System.out.println(e.area());
		System.out.println(e.perimeter());
	}

}
