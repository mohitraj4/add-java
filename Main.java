package com.jspider.hasa;
class Demo{
	void test() {
		System.out.println("Executing test()...");
	}
}
class Sample{
	Demo d=new Demo();
}

public class Main {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.d.test();
	}

}
