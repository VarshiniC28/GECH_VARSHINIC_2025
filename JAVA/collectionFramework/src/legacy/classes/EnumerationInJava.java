package legacy.classes;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInJava {

	public static void main(String[] args) {

		// Legacy way to iterate through collections before Iterator existed. - Enumeration

		Vector<Integer> v = new Vector<>();
		v.add(1); v.add(2);
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
		    System.out.println(e.nextElement());
		}

	}

}
