/**
 * 
 */

/**
 * @author javauser
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tire[] myTires = new Tire[4];
		myTires[0] = new Tire(40000, "Michelin");
		myTires[1] = new Tire(30000, "Sears");
		myTires[2] = new Tire(5000, "Goodyear");
		myTires[3] = new Tire(200, "Michelin");
		
		GasEngine myEngine = new GasEngine(450, "Ford", (byte) 12);
		
		Car myCar =  new Car("red", 1992, 0, "Ford", "Mustang", myEngine, myTires, 17.0f);
		
		myCar.idle();
		myCar.drive(428);
		
		System.out.println(myCar);
		System.out.println("MPG is: " + myCar.calcMPG());
		
		
		// Create 2nd Car instance
		Tire[] car2tires = new Tire[4];
		car2tires[0] = new Tire(10000, "Michelin");
		car2tires[1] = new Tire(70000, "Sears");
		car2tires[2] = new Tire(2000, "Goodyear");
		car2tires[3] = new Tire(12200, "Pereli");
		
		// Engine car2Engine = new Engine(220, "Honda", (byte) 6);
		Engine car2Engine = new RocketEngine("SpaceX", 4500000);
		
		Car car2 =  new Car("yellow", 2014, 0, "Honda", "S2000", car2Engine, car2tires, 14.0f);
		
		car2.idle();
		car2.drive(1000);
		System.out.println(car2);
		System.out.println("MPG is: " + car2.calcMPG());
	}

}












