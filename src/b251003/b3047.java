package b251003;

import java.util.Scanner;

public class b3047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int A = Math.min(a, Math.min(b, c));
		int C = Math.max(a, Math.max(b, c));
		int B = a + b + c - A - C;
		
		String n = sc.next();
		
		for(int i = 0; i < 3; i++) {
			if(n.charAt(i) == 'A') {
				System.out.print(A + " ");
			} else if(n.charAt(i) == 'B') {
				System.out.print(B + " ");
			} else if(n.charAt(i) == 'C') {
				System.out.print(C + " ");
			}
		}
	}
}