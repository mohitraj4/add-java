package com.jspider.overriding;
class Parent{
	void watchTv() {
		System.out.println("News/Serial");
	}
}
class child extends Parent{
	
	void watchTv() {
		System.out.println("Sports/Movies");
	}
}

public class Main {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.watchTv();
		
		child  c=new child();
		c.watchTv();
		
		Parent ref=new child();
		ref.watchTv();
	}

}
