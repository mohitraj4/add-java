package com.jspiders.upcasting;

public class Mainclass1 {
	public static void main(String[]args) {
		Mobile mob=new Mobile();
		Television tv=new Television();
		Flipcart.addToCart(tv);
		Flipcart.addToCart(mob);
		
	}

}
