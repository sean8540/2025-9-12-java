package b250924;

import java.util.Scanner;

public class b14215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		int max = Math.max(a, Math.max(b, c));
		
		if(sum - max > max) {
			System.out.println(sum);
		} else {
			System.out.println(2 * (sum - max) - 1);
		}
		
//		int max = a;
//		if (b > max) {
//			max = b;
//		}
//		
//		if (max < c) {
//			max = c;
//		}
//
//		if (max == a) {
//			if (max >= b + c) {
//				max = b + c - 1;
//				System.out.println(max + b + c);
//			} else {
//				System.out.println(max + b + c);
//			}
//		} else if (max == b) {
//			if (max >= a + c) {
//				max = a + c - 1;
//				System.out.println(max + a + c);
//			} else {
//				System.out.println(max + a + c);
//			}
//		} else if (max == c) {
//			if (max >= a + b) {
//				max = a + b - 1;
//				System.out.println(max + a + b);
//			} else {
//				System.out.println(max + a + b);
//			}
//		}
	}
}