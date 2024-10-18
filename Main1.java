package myownwork;
import java.util.Scanner;

public class Main1 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  Maths Marks:");
	int ms=sc.nextInt();
	
	System.out.println("Enter IT Marks:");
	int cs=sc.nextInt();
	
	System.out.println("Enter Physics Marks:");
	int pe=sc.nextInt();
	
	if(ms<35)
	{
		System.out.println("You Fail The Exam & You Scored:"+ms);
		
	}
	else {
		System.out.println("You Passed The Exam & You Scored:"+ms);
		}
	
	if(cs<35)
	{
		System.out.println("You Fail The Exam & You Scored:"+cs);
		
	}
	else {
		System.out.println("You Passed The Exam & You Scored:"+cs);
	}
	
	if(pe<35)
	{
		System.out.println("You Fail The Exam & You Scored:"+pe);
		
	}
	else {
		System.out.println("You Passed The Exam & You Scored:"+pe);
	}
	}

}
	


