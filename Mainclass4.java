package com.jspider.downcasting;

public class Mainclass4 {
	public static void main(String[] args) {
		SoftwareEngineer se=new Developer();
		se.meeting();
		if(se instanceof Developer) {
			System.out.println("Developer Found");
			Developer d=(Developer)se;
			d.coding();
		}
		else if(se instanceof Tester) {
			System.out.println("Tester Found");
			Tester t=(Tester)se;
			t.testing();
		}
	}

}
