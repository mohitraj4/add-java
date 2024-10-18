package mycoding;

class FreeAntiVirus
{
	FreeAntiVirus(){
		System.out.println("Virus Sacan Initialization");
	}
}
class PaidAntiVirus extends  FreeAntiVirus
{
	PaidAntiVirus(){
		super();
		System.out.println("Data Security Initialization");
		System.out.println("Anti Theft Initialization");
	}
}
	

public class Mainclass3 {
	public static void main(String[] args) {
		PaidAntiVirus paid=new PaidAntiVirus();
	}

}
