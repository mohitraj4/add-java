package mycoding;
class Demo{
	Demo(){
		System.out.println("Demo() Constructor");
	}
}
class Sample extends Demo{
	Sample(){
		super();
		System.out.println("Sample() Constructor");
	}
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		Sample s1=new Sample();
	}
}

