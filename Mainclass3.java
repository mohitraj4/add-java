package com.jspider.downcasting;

class SoftwareEngineer{
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

public class Mainclass3 {
	public static void main(String[] args) {
	SoftwareEngineer ref=new Developer;
	ref 
	}

}
