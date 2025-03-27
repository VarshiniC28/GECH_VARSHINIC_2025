package com.wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * Java is pure OOPs or Not?
		 * -> Java is not a purely object-oriented programming language because it supports primitive data types which are not objects. 
		 * -> A purely object-oriented language would treat everything as an object.
		 * 
		 * PRIMITIVE DATA TYPES: 
		 * byte, short, int, long, float , double, char , boolean.
		 * 
		 * COLLECTIONS: 
			=>Java provides Collections Framework (ArrayList, HashSet, HashMap, etc.) t
			to store and manipulate groups of objects as a single entity.
			=>However, collections work only with objects, not primitives.
			For example:
			ArrayList<int> list = new ArrayList<>(); // ❌ Not allowed, int is a primitive type
			ArrayList<Integer> list = new ArrayList<>(); // ✅ Allowed, Integer is a wrapper class
			This is where wrapper classes come in.
			
			COLLECTIONS:
		 * ===========
		 * => To store group of indiviual objects as a single entity.
		 * => we can perform operation/create collection on objects like strings(non primitive) not on primitive data types
		 * => Hence we use WRAPPER CLASS.
		 * 					=========
		 * 10,20,30, 40, 50 => int(primitive data types)
		 * 
		 * 
		 * 	WRAPPER CLASS: Java provides wrapper classes to convert primitive data types into objects.
		 * ================
		 * => Conversion of prim data types into objects to perform collection.
		 * byte --> Byte (max-127, min- -128)
		 * short --> Short
		 * int --> Integer
		 * long --> Long
		 * float --> Float
		 * double --> Double
		 * char --> Character
		 * boolean --> Boolean
		 * 
		 * ⚠️ Collections like ArrayList cannot store primitive data types.
		 * ✅ But using Wrapper Classes, we can store primitive values as objects!
		 * */
		
		//Key Features of Wrapper Classes:
		
		//1 AUTO BOXING ->  FROM PRIMITIVE TO WRAPPER
		//TWO ways:
		//a. implicit:
		int a =100;
		Integer i =a; //converted int datatype of a to -> i the Integer -object( using wrapperclass)
		System.out.println("Int(prim data): " +a);
		System.out.println("Integer(object): "+i);
		System.out.println("Integer type:"+i.getClass().getName());
		
		//b. explicit:
		int b=106;
		Integer j = Integer.valueOf(b);
		System.out.println("Int(prim data): " +b);
		System.out.println("Integer(object): "+j);
		System.out.println("Integer type:"+j.getClass().getName());
		
		System.out.println("______________________________________________________");
//		EG: 
		byte c = 3;
//		Byte d = c; //implicit
		Byte d = Byte.valueOf(c); //explicit
		System.out.println("byte(prim data): " +c);
		System.out.println("Byte(object): "+d);
		System.out.println("Byte type:"+d.getClass().getName());
		
		System.out.println("_______________________________________________________________");
		char v = 'c';
		
		System.out.println("---------------------------------------------------------------------------");
		
		//2. UNBOXING -> FROM WRAPPER CLASS TO PRIMITIVE 
		Integer i1 = 20;
		int a1 = i1.intValue();//explicit
//		int a1 = i1; //implicit
		System.out.println("Int: "+a1);
		System.out.println("Integer: "+i1);
		System.out.println("Integer type:"+i1.getClass().getName());
		
		System.out.println("____________________________________________________");
		
		Byte e = 5;
//		byte f = e; //implicit
		byte f = e.byteValue(); //explicit
		System.out.println("byte(prim data): " +f);
		System.out.println("Byte(object): "+e);
		System.out.println("Byte type:"+e.getClass().getName());
		
	}

}
