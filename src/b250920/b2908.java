package b250920;

import java.util.Scanner;

public class b2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		String ra = "";
		String rb = "";
		
		for(int i = A.length()-1 ; i >= 0; i--) {
			ra = ra + A.charAt(i);
		}

		for(int i = B.length()-1 ; i >= 0; i--) {
			rb = rb + B.charAt(i);
		}
		
		int a = Integer.parseInt(ra);
		int b = Integer.parseInt(rb);
		
		if(a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}