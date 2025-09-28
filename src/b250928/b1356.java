package b250928;

import java.util.Scanner;

public class b1356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		int r = N.length();

		for (int i = 1; i < r; i++) {
			int s1 = 1;
			int s2 = 1;

			for (int j = 0; j < i; j++) {
				s1 *= N.charAt(j) - '0';
			}

			for (int l = r; l > i; l--) {
				s2 *= N.charAt(l - 1) - '0';
			}

			if (s1 == s2) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}