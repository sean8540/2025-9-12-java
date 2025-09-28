package b250928;

import java.util.Scanner;

public class b2010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int c = sc.nextInt();
			if(i == N-1) {
				sum += c;
			} else {
				sum += c -1;
			}
		}
		System.out.println(sum);
	}
}