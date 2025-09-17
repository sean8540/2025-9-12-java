package b250917;

import java.util.Scanner;

public class b2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) { // 1 2 3 4 5
			for(int j = 1; j < a - i; j++) { // 4 3 2 1
				System.out.print(" ");
			}
			for(int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}