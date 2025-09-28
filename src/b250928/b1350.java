package b250928;

import java.util.Scanner;

public class b1350 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] f = new long[N];
		
		for(int i = 0; i < N; i++) {
			int size = sc.nextInt();
			f[i] = size;
		}
		
		long c = sc.nextLong();
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			if(f[i] == 0) {
				sum += 0;
			} else if(f[i]%c == 0){
				sum += f[i]/c;
			} else {
				sum += f[i]/c + 1;
			}
		}
		System.out.println(sum * c);
	}
}