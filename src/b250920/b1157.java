package b250920;

import java.util.Scanner;

public class b1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String w = sc.next().toUpperCase();
		int max = 0;		
		
		int[] a = new int[26];

		for(int i = 0; i < w.length(); i++) {
			a[w.charAt(i) - 'A'] ++;
		}
		
		char W = '?';
		for(int i = 0; i < 26; i ++) {
			if(max < a[i]) {
				max = a[i];
				W = (char)(i + 'A');
			}else if(max == a[i]) {
				W = '?';
			}
		}
		System.out.println(W);
	}
}