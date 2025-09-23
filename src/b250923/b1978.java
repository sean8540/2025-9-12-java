package b250923;

import java.util.Scanner;

public class b1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			boolean b = true;
			for(int j = 2; j < a; j++) {
				if(a%j==0) {
					b = false;
				}
			}
			if(a == 1) {
				b = false;
			}
			if(b) {
				count++;
			}
		}
		System.out.println(count);
	}
}