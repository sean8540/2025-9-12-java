package b250930;

import java.util.Scanner;

public class b2490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			int sum = 0;
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			sum = a + b + c + d;
			
			if(sum == 0) {
				System.out.println("D");
			} else if(sum == 1) {
				System.out.println("C");
			} else if(sum == 2) {
				System.out.println("B");
			} else if(sum == 3) {
				System.out.println("A");
			} else if(sum == 4) {
				System.out.println("E");
			}
		}
	}
}