package b250923;

import java.util.Scanner;

public class b2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = N;
		int sum = 0;
		
		for(int i = M; i <= N; i++) {
			boolean b = true;
			
			if(i == 1) {
				b = false;
			}
			
			for(int l = 2; l < i; l++) {
				if(i%l == 0) {
					b = false;
					break;
				}
			}
			if(b) {
				if(min > i) {
					min = i;
				}
				sum += i;
			}
		}
		if(sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}