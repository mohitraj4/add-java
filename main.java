package mycoding;

class city{
	city(){
		System.out.println("New York");
	}
	city(int a){
		this();
		System.out.println("London");
	}
	city(double d){
	this(10);
	System.out.println("Dubai");
	}
}

public class main {
	public static void main(String[]args)
	{
		city c=new city(8.9);
		
	}

}
