package b250929;

import java.util.Scanner;

public class b2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int l = N - i; l > 0; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}