package patternProgramming;

public class numberPattern {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
	
		// printing 1 to 25 in 5*5 grid
		int n=5;
		int count=1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n;j++) {
				if(count < 10) {
					System.out.print("0");
				}
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		int a = 5;  // Grid size
        for (int i = 1; i <= a; i++) {         // Rows
            for (int j = 1; j <= a; j++) {     // Columns
                System.out.printf("%-3d", (i - 1) * a + j);  // Calculate and print
            }
            System.out.println();  // Move to next line
        }
	
        System.out.println();
        
        //print 5*5 grid with 1,2,3,4,5 then 2,4,6,8,10 then 3,6,9,12,15
        int m=5;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n;j++) {
				int x = i*j;
				if(x < 10) {
					System.out.print("0");
				}
				System.out.print(x+" ");
	
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 1,2,3,4,5 - 2,3,4,5,6 - 3,4,5,6,7 - 4,5,6,7,8 - 5,6,7,8,9
		 int y=5;
			for (int i=1; i<=y; i++) {
				for(int j=1; j<=y;j++) {
					System.out.print((i+j-1)+" ");
				}
				System.out.println();
			}
			
			
}
}
