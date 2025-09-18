package b250918;

import java.util.Scanner;

public class b10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] B = new int[N];
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for(int j = a; j <= b; j++) {
				B[j-1] = c;
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.print(B[i] + " ");
		}
	}
}