package com.jspider.overriding;

import mycoding.main;

class FacebookOld{
	void reaction() {
		System.out.println("Like");
		
	}
}
class FacebookNew extends FacebookOld{
	void reaction() {
		System.out.println("Like WoW Love Sad HaHa");
	}
}

public class Main2 {
	public static void main(String[] args) {
		FacebookOld fbOld=new FacebookOld();
		fbOld.reaction();
		FacebookNew fbNew=new FacebookNew();
		fbNew.reaction();
		FacebookOld fb=new FacebookNew();
		fb.reaction();
	}
}
