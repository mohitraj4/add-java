package com.jspiders.upcasting;

class Delta{
	void run() {
	System.out.println("Executing run()....");
	}
}
class Example extends Delta{
	void send() {
		System.out.println("Executing send()...");
	}
}

public class Main {
	public static void main(String[]args)
	{
		Delta ref=new Example();//UPCASTING : Example----> Delta
		ref.run();
	}

}
