package com.jspider.downcasting;
class Alpha
{
	void test() {
		System.out.println("Executing test()....");
	}
}
class Beta extends Alpha{
	void disp() {
		System.out.println("Executing disp()...");
	}
}

public class Mainclass1 {
	public static void main(String[]args) {
		Alpha a=new Beta();
		a.test();
		Beta b=(Beta)a;//DOWNCASTING : Alpha ---->Beta
		b.test();
		b.disp();
	}

}
