package com.jspider.downcasting;

public class Flipkart {
	static void addToKart(Product P) {
		if(P instanceof Mobile ) {
			System.out.println("Delivery in Bike");
		}
		else if(P instanceof Television) {
			System.out.println("Delivery in Tata ACE");
		}
		else if(P instanceof Refrigerator) {
			System.out.println("Delivery in Truck");
		}
	}

}
