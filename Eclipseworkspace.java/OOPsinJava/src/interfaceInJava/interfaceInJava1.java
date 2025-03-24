package interfaceInJava;
//==> Java doesnt support multiple parent classes to be extened to a single child ,in that case we use multiple interfaces as below

//2 interfaces with 2 different methods in each --> methodA(), methodB();
//2 interface with 1 same method method()
interface A{
	public void method();
//	public void methodA();
}

interface B{
	public void method();
//	public void methodB();
}

class Child implements A,B{

	@Override
	public void method() {
		System.out.println("This is method from both A and B");
//		System.out.println("This is methodB");
	}
//
//	@Override
//	public void methodA() {
//		System.out.println("This is method A");
//	}

}

public class interfaceInJava1 {

	public static void main(String[] args) {
		/*
		 * */
		Child child = new Child();
		child.method();
//		child.methodB();
	}

}
