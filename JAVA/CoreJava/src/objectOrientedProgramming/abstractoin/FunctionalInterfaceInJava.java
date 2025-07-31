package objectOrientedProgramming.abstractoin;

@FunctionalInterface
interface FunctInte{
	void disp(int a); //can give parameters
//	void disp2(); // not possible because Functional Interface can have only one abstract method
}

//One way to implement Functional interface is through class and other is inner class which will provide us security and also other way is / Anonymous Inner class with more security and for still more security and less lines we use lambda expression
//class Alphaa implements FunctInte{
//
//	@Override
//	public void disp() {
//		System.out.println("..");
//	}
//	
//}

public class FunctionalInterfaceInJava {

	public static void main(String[] args) {

		//Functional Interface : Interface with only one abstract method is called Functional Interface 
		//This concept came from JAVA 8.0 /JDK 1.8 version
		
		//inner class 
//	class Alphaa implements FunctInte{
//
//			@Override
//			public void disp() {
//				System.out.println("..");
//			}
//			
//		}
//		Alphaa a = new Alphaa();
//		a.disp();
		
		// Anonymous Inner class which has no class keyword no class name and implements keyword 
		//but has only Functional Interface name with brackets and object of that class with new keyword and reference to it and ; at end as below
		FunctInte d = new FunctInte(){
			@Override
			public void disp(int a) {
				System.out.println(a);
			}
		};
		d.disp(2);
		
		//through Lambda expression : () -> {}; // all of these are possible syntaxes
		//lambda expression is only possible for functional interface not for other interfaces
		FunctInte f = (int a) -> System.out.println(a);
		f.disp(2);
		
		FunctInte fu = (a) -> System.out.println(a);
		f.disp(2);
		
		FunctInte fun = a -> System.out.println(a);
		f.disp(2);
	}

}
