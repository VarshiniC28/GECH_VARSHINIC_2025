package typeCasting;

public class Explicit {

	public static void main(String[] args) {

//		Explicit : double > float > long > int > short > byte
//		int > char
		
		double a = 45.5;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
