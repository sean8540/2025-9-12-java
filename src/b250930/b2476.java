package b250930;

import java.util.Scanner;

public class b2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int total = 0;
			
			if(a == b && a == c) {
				total = 10000 + a * 1000;
			} else if(a == b || a == c) {
				total = 1000 + a * 100;
			} else if(b == c) {
				total = 1000 + b * 100;
			} else {
				int n = Math.max(a, Math.max(b, c));
				total = n * 100;
			}
			
			if(total > max) {
				max = total;
			}
		}	
		System.out.println(max);
	}
}