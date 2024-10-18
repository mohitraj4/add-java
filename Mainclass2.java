package mycoding;
class Alpha{
	Alpha(){
		System.out.println("Alpha() Constructor");
	}
	Alpha(int a){
		System.out.println("Alpha(int) Constructor");
	}
}
class Beta extends Alpha
{
	Beta(){
		super(10);
		System.out.println("Beta() Constructor");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Beta b=new Beta();
	}

}
