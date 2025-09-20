package b250920;

import java.util.Scanner;

public class b10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int[] a = new int[26];

		for (int i = 0; i < 26; i++) {
			a[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			if (a[s.charAt(i) - 'a'] == -1) {
				a[s.charAt(i) - 'a'] = i;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}
	}
}