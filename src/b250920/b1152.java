package b250920;

import java.util.Scanner;

public class b1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String s = S.trim();
		
		int count = 1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				count ++;
			}
		}
		if(s.length() == 0) {	// 전부 공백일 경우
			System.out.println(0);
		} else {
			System.out.println(count);
		}
	}
}