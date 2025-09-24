package b250924;

import java.util.Scanner;

public class b5073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}

			if(a + b <= c || b + c <= a || a + c <= b) {
				System.out.println("Invalid");
			}else if(a == b && a == c) {
				System.out.println("Equilateral");
			} else if(a == b || a == c || b == c) {
				System.out.println("Isosceles");
			} else if(a != b && a != c && b != c) {
				System.out.println("Scalene");
			}
		}
	}
}