package b250929;

import java.util.Scanner;

public class b1371 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alp = new int[26];
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			for(int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c >= 'a' && c <= 'z') {
				    alp[c - 'a']++;
				}
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < 26; i++) {
			if(alp[i] > max) {
				max = alp[i];
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(alp[i] == max) {
				System.out.print((char)(i + 'a'));
			}
		}
	}
}