package exceptionHandling;

public class InbuiltMethodsInThrowable {

	public static void main(String[] args) {

		try {
			int c = 100/0;
		}
		catch(Exception e) { //throwable has these inbuilt specialized methods which will be inherited by its child classes like exception , error..
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage()); //same as e.getMessage();
			
			System.out.println(e); //Doesnt give address of e, it returns value i.e Exception name with description using toString() method.
		
			//getMessage() - gives description
			//printStackTrace - gives type of exception + description + which line 
			//reference - gives type + description 
		}
	}

}
