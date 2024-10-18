package mycoding;

class Amazon {
	Amazon(){
	System.out.println("Initialization for Shopping");
}
Amazon(double fees){
	this();
	System.out.println("Initialization for Prime Video");
	System.out.println("Initialization for Prime Music");
}
}

public class Mainclass {
	public static void main(String[] args) {
		Amazon s1=new Amazon(3.9);
	}
	

}
