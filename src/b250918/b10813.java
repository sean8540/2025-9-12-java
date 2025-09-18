package b250918;

import java.util.Scanner;

public class b10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] B = new int[N];
		int c = 0;
		
		for(int i = 0; i < N; i++) {
			B[i] = i+1;
		}
		
		for(int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			c = B[a-1];
			B[a-1] = B[b-1];
			B[b-1] = c;
		}
		for(int i = 0; i < N; i++) {
			System.out.print(B[i] + " ");
		}
	}
}