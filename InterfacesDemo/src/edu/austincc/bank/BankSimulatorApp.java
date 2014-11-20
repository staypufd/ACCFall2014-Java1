package edu.austincc.bank;

public class BankSimulatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba = new BankAccount("Sams Savings Bank", 30000, 1);
		
		Check c = new Check("Paul", 1, "Sams Savings Bank", 1000);
		IOU iou1 = new IOU("Janu", 1000);
		
		
		System.out.println(c);
		System.out.println(ba);
		System.out.println(iou1);
		
		
		System.out.println(c.describe());
		System.out.println(ba.describe());
		System.out.println(iou1.describe());
		
		System.out.println("IOU is the same as the check? " + (iou1.compareTo(c)));
		
	}

}
