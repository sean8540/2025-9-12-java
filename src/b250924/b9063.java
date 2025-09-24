package b250924;

import java.util.Scanner;

public class b9063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int maxa = -10000;
		int mina = 10000;
		
		int maxb = -10000;
		int minb = 10000;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (maxa < a) {
				maxa = a;
			}
			
			if (maxb < b) {
				maxb = b;
			}
			
			if (mina > a) {
				mina = a;
			}
			
			if (minb > b) {
				minb = b;
			}
		}
		
		System.out.println((maxa-mina) * (maxb - minb));
	}
}