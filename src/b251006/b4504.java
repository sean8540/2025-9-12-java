package b251006;

import java.util.Scanner;

public class b4504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(true) {
			int N = sc.nextInt();
			
			if(N == 0) {
				break;
			}
			
			if(N % n == 0) {
				System.out.println(N + " is a multiple of " + n + ".");
			} else {
				System.out.println(N + " is NOT a multiple of " + n + ".");
			}
		}
	}
}