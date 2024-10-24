package com.jspider.overriding;
class Demo{
	void play() {
		System.out.println("Cricket/Football");
	}
}
class Sample extends Demo{
	void play() {
		System.out.println("Pubg/Cod");
	}
}
public class Main1 {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.play();
		Sample s=new Sample();
		s.play();
		Demo obj=new Sample();
		obj.play();
	}

}
