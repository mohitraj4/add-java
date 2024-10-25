package com.jspider.hasa;
class Camera{
	void takePhoto() {
		System.out.println("Mobile has a Camera");
	}
}
class SimCard{
	void networkService() {
		System.out.println("Mobile has a Simcard ");
	}
}
class Mobile{
	Camera c=new Camera();
	SimCard sim=new SimCard();
}

public class Main3 {
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.c.takePhoto();
		mob.sim.networkService();
	}

}
