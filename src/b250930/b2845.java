package b250930;

import java.util.Scanner;

public class b2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int P = sc.nextInt();
		
		int a = L * P;
		
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			System.out.print(n - a + " ");
		}
	}
}