package b250930;

import java.util.Scanner;

public class b2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String w = sc.next();
		StringBuilder W = new StringBuilder(w);
		
		for(int i = 0; i < w.length(); i++) {
			char c = W.charAt(i);
			if(c >= 'a' && c <= 'z') {
				W.setCharAt(i, (char)(c - 32));
			} else {
				W.setCharAt(i, (char)(c + 32));
			}
		}
		
		System.out.println(W.toString());
	}
}