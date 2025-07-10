package interviewCodeSnippets;

public class CodeSnippetsOnIncrementationAndDecre {
	
	public static void main(String[] args) {
		
//		++ : increment
//		-- : decrement
		
//		++a, --a : signs before var : pre increment
//		a ++, a-- : signs after var : post incremenet
		
//		1)
		int x = 5;           // x is initialized to 5
		int y;               // y declared
		y = ++x;             // Pre-increment: x becomes 6, then assigned to y → y = 6
		System.out.println(x); // 6 → because x was incremented before assignment
		System.out.println(y); // 6 → because y = incremented value of x

//		2)
		int j = 5;           // j is initialized to 5
		int i;               // i declared
		i = j++;             // Post-increment: i = 5 first, then j becomes 6
		System.out.println(j); // 6 → because j was incremented after assignment
		System.out.println(i); // 5 → because i got the original value of j before increment

//		3)
		int c = 5;                // c is initialized to 5
		int d;                    // d is declared
		d = ++c + ++c;            // First ++c → 6, second ++c → 7 → d = 6 + 7 = 13
		System.out.println(c);    // 7 → c incremented twice
		System.out.println(d);    // 13 → result of 6 + 7
		
		
//		4)
		int e=5;
		int f;
		f = e++ + e++; // 5+6 = 11
		System.out.println(e); //7
		System.out.println(f); //11
		
//		5)
		int g = 6;
		int h;
		h = ++g + g++; //7 + 7
		System.out.println(g); //8
		System.out.println(h); //14
		
//		6)
		int n =5;
		int m;
		m= n++ + ++n + n-- + --n + ++n + --n; //5 + 7 + 7 + 5 + 6 + 5 =35
		System.out.println(n); //5
		System.out.println(m); //35
		
//		7)
		int o =5;
		int p;
		p = o++;
		System.out.println(o); //o is 6 
		System.out.println(p); // 5
		
//		8)
		int q = 5;
		q = q++;             // Post-increment: q++ returns 5, but it's reassigned to q, so q remains 5
		System.out.println(q); // 5 → because the incremented value was not stored anywhere

		
		System.out.println("----------------------------------------------------");
		
		int a = 5; 
		int b;
		 b = a++ + ++a + a++ + --a + a-- + a++ + a++;
		System.out.println(a); // 8 → final value of a
		System.out.println(b); // 46 → sum of all used values
		

		// Step-by-step evaluation of:
		// b = a++ + ++a + a++ + --a + a-- + a++ + a++;

		// a = 5 initially
		// a++ → use 5, then a = 6
		// ++a → a becomes 7, use 7
		// a++ → use 7, then a = 8
		// --a → a becomes 7, use 7
		// a-- → use 7, then a = 6
		// a++ → use 6, then a = 7
		// a++ → use 7, then a = 8

		//b =   5   +  7   +  7   +  7   +  7   +  6   +  7;  // = 46

	}

}
