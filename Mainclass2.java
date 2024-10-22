package com.jspider.downcasting;

import mycoding.main;

class Delta{
	void run() {
		System.out.println("Executing run()....");
	}
}
class Example extends Delta{
	void send() {
		System.out.println("Executing send()....");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Delta ref=new Example();
		ref.run();
		Example ex=(Example)ref;//DOWNCASTING : Delta----->Example
		ex.run();
		ex.send();
	}

}
