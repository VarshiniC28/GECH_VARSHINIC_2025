package accesssModifiers;


public class AcessModifiers {
		
		/*
		 * Access Modifiers:
		 * private , public, protected , default(no modifier)
		 * */
	
	public int a; //can be accessed in any class in any package
	protected int b; //can be accessed only when in same package and in other packages only if it inherits this class.
	int c; // Any class but in the package only //package/default
	private int d; //only in the same class 
	
	void disp()	{
		System.out.println(a);
	}
	
	
}
