package b250924;

import java.util.Scanner;

public class b1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String a = sc.next();
		char[] W = new char[50];

		for (int i = 0; i < a.length(); i++) {
			W[i] = a.charAt(i);
		}

		for (int i = 0; i < N - 1; i++) {
			String b = sc.next();
			for (int j = 0; j < b.length(); j++) {
				if (W[j] != b.charAt(j)) {
					W[j] = '?';
				}
			}
		}

		for (int i = 0; i < a.length(); i++) {
			System.out.print(W[i]);
		}
	}
}