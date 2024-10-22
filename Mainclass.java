package com.jspider.downcasting;
class Demo
{
	
}
class Sample extends Demo
{
	
}

public class Mainclass {
	public static void main(String[]args)
	{
		Demo ref=new Sample();
		Sample obj=(Sample)ref;//DOWNCASTING : demo--->Sample
		System.out.println(ref);
		System.out.println(obj);
	}

}
