package com.jspider.overriding;
class Windows8{
	void start() {
		System.out.println("Tiles Views");
	}
}
class Windows10 extends Windows8{
	void start() {
		System.out.println("List Views");
	}
}
class Windows11 extends Windows10{
	void start() {
		System.out.println("Box Views");
	}
}

public class Main5 {
	public static void main(String[] args) {
		Windows8 w1=new Windows8();
		w1.start();
		Windows10 w2=new Windows10();
		w2.start();
		Windows11 w3=new Windows11();
		w3.start();
		Windows8 w=new Windows11();
		w.start();
		
	}

}
