package b250930;

import java.util.Scanner;

public class b2875 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		int count = 0;
		
		for(int i = 1; i < M+N; i++) {
			if(2 * i > N || i > M) {
				break;
			}
			
			if(2 * i <= N && i <= M) {
				if(N + M - (3*i) >= K) {
					count++;
				} else {
					break;
				}
			}
			
		}
		
		System.out.println(count);
	}
}