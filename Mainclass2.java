package com.jspiders.upcasting;

public class Mainclass2 {
	public static void main(String[] args) {
		Apple a=new Apple();
		Banana b=new Banana();
		Mango m=new Mango();
		BigBasket.addToBasket(m);
		BigBasket.addToBasket(b);
		BigBasket.addToBasket(a);
	}
}
