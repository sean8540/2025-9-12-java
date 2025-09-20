package b250919;

import java.util.Scanner;

public class b10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] B = new int[N];
			
		for(int i = 1; i <= N; i++) {
			B[i-1] = i;
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j = 0; j< (b-a+1)/2; j++) {
				int p = B[a-1+j];
				B[a-1+j] = B[b-1-j];
				B[b-1-j] = p;
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(B[i] + " ");
		}
	}
}