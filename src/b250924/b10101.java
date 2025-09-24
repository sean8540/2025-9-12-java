package b250924;

import java.util.Scanner;

public class b10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && a == c && a + b + c == 180) {
			System.out.println("Equilateral");
		} else if (a == b && a + b + c == 180) {
			System.out.println("Isosceles");
		} else if (a == c && a + b + c == 180) {
			System.out.println("Isosceles");
		} else if (c == b && a + b + c == 180) {
			System.out.println("Isosceles");
		} else if (a != b && a != c && b != c && a + b + c == 180) {
			System.out.println("Scalene");
		} else if (a + b + c != 180) {
			System.out.println("Error");
		}
	}
}