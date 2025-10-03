package b251002;

import java.util.Scanner;

public class b2965 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(C - B >= B - A) {
			System.out.println(C - B - 1);
		} else {
			System.out.println(B - A - 1);
		}
	}
}