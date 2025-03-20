package functionsInJava.functions;

public class FunctionsInJava2 {
	
	//1. public function
	//-> anywhere
	public void publicFunction() {
		System.out.println("This is public function");
	}
	
	//2. private function
	//-> within class
	private void privateFunction() {
		System.out.println("This is private function");
	}
	
	//3. Default function
	// within package
	void defaultFunction() {
		System.out.println("This is default function");
	}
	
	//4. Protected function
	//within package and subclass in other package
	//by extending child class with this parent package name.
	protected void ProtectedFunction() {
		System.out.println("This is protected function");
	}
	
	//5. Static function
	//we can access by using class name
	public static void staticFunction() {
		System.out.println("this is static function");
	}
	
	public static void main(String[] args) {
		FunctionsInJava2 obj1 = new FunctionsInJava2();
		obj1.publicFunction();
		obj1.privateFunction();
		obj1.ProtectedFunction();
		FunctionsInJava2.staticFunction();
	}

}
