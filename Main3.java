package com.jspider.overriding;
class Whatsapp1{
	void deliveryReport() {
		System.out.println("Sent");
	}
}
class Whatsapp2 extends Whatsapp1{
	void deliveryReport() {
		System.out.println("Delivery");
	}
}
class Whatsapp3 extends Whatsapp2{
	void deliveryReport() {
		System.out.println("Seen");
	}
}

public class Main3 {
	public static void main(String[] args) {
		Whatsapp1 ref1=new Whatsapp1();
		ref1.deliveryReport();
		Whatsapp2 ref2=new Whatsapp2();
		ref2.deliveryReport();
		Whatsapp3 ref3=new Whatsapp3();
		ref3.deliveryReport();
		Whatsapp1 ref=new Whatsapp3();
		ref.deliveryReport();
		
		
	}

}
