package com.jspider.overriding;

import mycoding.main;

class GmailV1{
	void compose() {
		System.out.println("Open new tab in browser");
	}
}
class GmailV2 extends GmailV1{
	void compose() {
		System.out.println("Pop up Box");
	}
}
public class Main4 {
	public static void main(String[] args) {
		GmailV1 g1=new GmailV1();
		g1.compose();
		GmailV2 g2=new GmailV2();
		
	    g2.compose();
		GmailV1 g=new GmailV2();
		g.compose();
	}

}
