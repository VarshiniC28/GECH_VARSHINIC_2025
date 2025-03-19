package introduction_to_java.first_program;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		/*
		 * if, if else, else if and switch statement
		 * 1. if:
		 * if(condition){
		 * }
		 * 
		 * 2. if else:
		 * if(condition){
		 * }else{
		 * }
		 * 
		 * 3. else if ladder
		 * if(condition){
		 * }else if(condition){
		 * }else if(condition){
		 * }else{
		 * }
		 * 
		 * 4. switch statement
		 * */
		
		//if statement:
		
		int a =2;
		int b=3;
		if(a>b) {
			System.out.println("a is greater");
		}
		
		//2. if else
		int c =2;
		int d=3;
		if(c>d) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		
		//3. else if ladder
		int e=2;
		int f=3;
		if(e>f) {
			System.out.println("e is greater");
		}else if(e<f) {
			System.out.println("f is greater");
		}else {
			System.out.println("e and f are equal");
		}
		
		//4. switch statement
		
		// in java 8 switch was written like this
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day) {
		case 1:{
			System.out.println("Sunday");
			break;
		}
		case 2:{
			System.out.println("Monday");
			break;
		}
		case 3:{
			System.out.println("Tuesday");
			break;
		}
		case 4:{
			System.out.println("Wednesday");
			break;
		}
		case 5:{
			System.out.println("Thursday");
			break;
		}
		case 6:{
			System.out.println("Friday");
			break;
		}
		case 7:{
			System.out.println("saturday");
			break;
		}
		default: System.out.println("Invalid!");
		}
		
		// in java 11 switch statement was written like this 
		int num = sc.nextInt();
		switch(num) {
			case 1 -> System.out.println("Sunday");
			case 2 -> System.out.println("Monday");
			case 3 -> System.out.println("tuesay");
			case 4 -> System.out.println("wednesday");
			case 5 -> System.out.println("thursday");
			case 6 -> System.out.println("friday");
			case 7 -> System.out.println("saturday");
			default -> System.out.println("Invalid!");
		}
		
		// this was introduced with java 17
		int week = sc.nextInt();
		switch(week) {
		case 1,  2,  3,  4, 5-> System.out.println("weekday");
		case 6, 7 -> System.out.println("weekend");
		default -> System.out.println("!Invalid");
		}
		//or
		int days=  sc.nextInt();
		String result = switch(days){
		case 1,2,3,4,5 -> "Weekday";
		case 6, 7 -> "Weekend";
		default ->"Invalid day";
		};
		System.out.println("The result is: "+result);
		
		}
	}
		


