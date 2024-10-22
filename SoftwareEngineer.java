package com.jspider.downcasting;

public class SoftwareEngineer {
	void meeting() {
		System.out.println("Meeting....");
		
	}
}
class Developer extends SoftwareEngineer{
	void coding() {
		System.out.println("Coding.....");
	}
}
class Tester extends SoftwareEngineer{
	void testing() {
		System.out.println("Testing....");
	}
}

