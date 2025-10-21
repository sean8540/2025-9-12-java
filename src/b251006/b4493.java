package b251006;

import java.util.Scanner;

public class b4493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = 0;
			int b = 0;

			for (int j = 0; j < n; j++) {
				String A = sc.next();
				String B = sc.next();

				if (A.equals(B)) {
					continue;
				}

				if ((A.equals("R") && B.equals("S")) || (A.equals("S") && B.equals("P"))
						|| (A.equals("P") && B.equals("R"))) {
					a++;
				} else {
					b++;
				}
			}

			if (a > b) {
				System.out.println("Player 1");
			} else if (b > a) {
				System.out.println("Player 2");
			} else {
				System.out.println("TIE");
			}
		}
	}
}