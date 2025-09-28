package b250928;

import java.util.Scanner;

public class b1333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		int D = sc.nextInt();
		
		int total = N * L + (N-1) * 5;
		
		int t = 0;
		
		while(true) {
			t += D;
			
			if(t > total) {
				System.out.println(t);
				break;
			}
			
			int i = t/(L + 5);	// 몇번째 세트인지 (전체 = t, 세트 = L + 5)
			int start = i * (L + 5);
			int end = start + L;
					
			if (t >= end && t < start + L + 5) {	// 쉬는시간동안 일 때
				System.out.println(t);
				break;
			}
		}
	}
}