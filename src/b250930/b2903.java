package b250930;

import java.util.Scanner;

public class b2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int first = 2;
		
		for(int i = 0; i < N; i++) {
			first = 2 * first - 1;
		}
		
		System.out.println(first * first);
	}
}