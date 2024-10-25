package com.jspider.hasa;
class Account{
	void withdraw() {
		System.out.println("Bank has a Account");
	}
}
class Customer{
	Account ac=new Account();
}
class Bank{
	Customer c=new Customer();
}
public class Main4 {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.c.ac.withdraw();
	}
	
}
