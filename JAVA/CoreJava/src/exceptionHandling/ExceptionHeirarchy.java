package exceptionHandling;

public class ExceptionHeirarchy {

	public static void main(String[] args) {

		try {
			int c = 100/0;
		}
//		catch(Exception e) { //How Exception can catch Arithmetic Exception object?Because its parent - polymorphism - loose coupling - Parent ref with child object ==> Exception e = new ArithmeticException, same goes with error 
//			System.out.println("Handled");
//		}
//		catch(Throwable t) {
//			System.out.println("Handled"); //This also can catch the exception and error child object since its is also parent 
//		}
		catch(RuntimeException r) { //This also can catch the exception not error object since its is also parent 
			System.out.println();
		}
		
//		catch(IOException i) { //doesnt work since its is compile time 
			
//		}
	}

}
