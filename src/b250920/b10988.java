package b250920;

import java.util.Scanner;

public class b10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		boolean p = true;
		
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				p = false;
				break;
			}
		}
		if(p) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}