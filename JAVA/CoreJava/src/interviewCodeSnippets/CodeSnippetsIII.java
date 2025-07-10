package interviewCodeSnippets;

public class CodeSnippetsIII {

	public static void main(String[] args) {

//		1)
		int m=10, n=10;
		int res = m++ / (++n * n--) / --m; // --> 10 /(11 * 11) / 10 = 10/121 * 1/10 = 1/121 
		System.out.println(res); //0 ==> 10 / 121 = 0 (int division, decimal truncated), ==> 0 / 10 = 0
		
		
//		2)
		int x=001, y=010, z=100; // x= 0x8+1=1, y=1x8+0=8, z=100
		int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x; // 0 + 8 - 100 - 98 + 10 + 1 + 10 + 2
		System.out.println(x); //-2
		System.out.println(y); //9
		System.out.println(z); //98
		System.out.println(i); // -167
		
//		3)
		int ch = 'A'; // A unicode value 65 is assigned to int as integer , char > int : implicit 
//		System.out.println(ch++); //65
		System.out.println(++ch); //66
		System.out.println(ch); //66
		
//		4)
		int c = 'A', C = 'a'; //c is 65 and C is 97
		System.out.println(c++ + ++C); // 65 + 98 = 163
		
//		5)
		byte j = 5;
//		j = j*10; // will give error since int cant be put into byte - needs explicit casting
		j = (byte)(j*10);
		System.out.println(j); //50
		
//		6)
		double a = 150.0;
		byte b = (byte)a; //needs explicit casting to work 
		// 150 converted into byte is out of range by 23, so from 128 we should subtract23-1 =22 i.e 128-22 = 106, answer is -106
		System.out.println(a); //150.0
		System.out.println(b); //-106
	}

}
