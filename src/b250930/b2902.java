package b250930;

import java.util.Scanner;

public class b2902 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		StringBuilder S = new StringBuilder(s);
		
		for(int i = 0; i < s.length(); i++) {
			if(S.charAt(i) >= 65 && S.charAt(i) <= 90) {
				System.out.print(S.charAt(i));
			}
		}
	}
}