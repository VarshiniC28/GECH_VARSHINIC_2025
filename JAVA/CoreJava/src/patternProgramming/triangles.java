package patternProgramming;

public class triangles {

	public static void main(String[] args) {

		// right angled triangle *
		int n =5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// right angled triangle number
		int a =5;
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// right angled triangle - continous numbers
		int x= 5;
		int count = 1;
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=i; j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print((count++)+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// mirrored right angled triangle
		int y =5;
		//in a row
		for(int i=1; i<=y; i++) {
			// Spaces:
			for(int k=0; k<=y-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int l =5;
		//in a row
		int v = 1;
		for(int i=1; i<=l; i++) {
			// Spaces:
			for(int k=0; k<=l-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print(v++);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		//Hallow right angled triangle
		int e=5;
		for(int i=1; i<=e; i++) {
			for(int j=1; j<=i; j++) {
				if(j==1 || i==5 || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		// oR
		System.out.println();
		
		int f=5;
		for(int i=1; i<=f; i++) {
			for(int j=1; j<=i; j++) {
				if((i==3 & j==2) || (i==4 & j==2) ||(i==4 & j==3)) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		
		System.out.println("--------------------------------------------------------------------------------");
//		Pyramid
		int b = 5;
		for(int i=1;i<=b;i++) {
			//spaces
			for(int k=1; k<=b-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		//hallow pyramid:
		int c = 5;
		for(int i=1; i<=c; i++) {
			for(int k=1; k<=c-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				if((i==3 & j==2) || (i==4 & j==2) || (i==4 & j==3)) {
					System.out.print(" "+" ");
				}else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		
		//OR
		
		int d=5;
		for(int i=1; i<=d; i++) {
			for(int k=1; k<= d-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				if(j==1 || i==d || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------");
		
		//Mirrored Hallow right angled triangle
		
		int g =5;
		for(int i=1; i<=g; i++) {
			for (int k=1; k<=g-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				if(j==1 || i==g || i==j) {
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


