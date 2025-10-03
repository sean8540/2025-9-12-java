package b251002;

import java.util.Scanner;

public class b2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int[] sum = new int[5];
		
		for(int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			sum[i] = a + b + c + d;
			if(max < sum[i]) {
				max = sum[i];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			if(max == sum[i]) {
				System.out.print((i+1) + " " + max);
			}
		}
	}
}