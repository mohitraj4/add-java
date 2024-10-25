package com.jspider.hasa;
class Departement{
	void test() {
		System.out.println("College has a Department");
		
	}
}
class Teacher{
	void teach() {
		System.out.println("Teacher teachs in the class");
	}
}
class College{
	Departement d=new Departement();
	Teacher t=new Teacher();
}


public class Main2 {
	public static void main(String[] args) {
		College col=new College();
		col.d.test();
		col.t.teach();
	}
}
