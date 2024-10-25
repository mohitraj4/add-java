package com.jspider.hasa;
class Printer{
	void print() {
		System.out.println("Printing page");
	}
}
class Computer{
	static Printer out=new Printer();
}

public class Main5 {
	public static void main(String[] args) {
		Computer.out.print();
	}

}
