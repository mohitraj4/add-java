package com.jspider.hasa;

import mycoding.main;

class Engine{
	void power() {
		System.out.println("Engine Provides Power");
	}
}
class Driver{
	void drive() {
		System.out.println("Driver is Driving");
	}
}
class Car{
	Engine eng=new Engine();//COMPOSITION
	Driver ref=new Driver();//AGGREGATION
}

public class Main1 {
	public static void main(String[] args) {
		Car c=new Car();
		c.eng.power();
		c.ref.drive();
	}
}
