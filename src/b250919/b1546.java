package b250919;

import java.util.Scanner;

public class b1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double max = 0;
		int[] S = new int[N];
		
		for(int i = 0; i < N; i++) {
			S[i] = sc.nextInt();
			if(max < S[i]) {
				max = S[i];
			}
		}
		
		double sum = 0;
				
		for(int i = 0; i < N; i++) {
			sum += S[i]*100/max;
		}
		System.out.println(sum/N);
	}
}