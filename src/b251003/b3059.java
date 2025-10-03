package b251003;

import java.util.Scanner;

public class b3059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			String s = sc.next();
			int total = 2015;
			int[] alp = new int[26];
			
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if(alp[c - 'A'] == 0) {
					total -= c;
					alp[c - 'A']++;
				}
			}
			
			System.out.println(total);
		}
	}
}