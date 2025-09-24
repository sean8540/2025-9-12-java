package b250924;

import java.util.Scanner;

public class b1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int N = a;
			int[] c = new int[4];
			
			for(int l = 0; l <4; l++) {
				c[l] = N % 10;
				N *= a;
			}
			
			int last = (b-1)%4;
			
			if(c[last] == 0) {
				System.out.println(10);
			} else {
				System.out.println(c[last]);
			}
		}
	}
}