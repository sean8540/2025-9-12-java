package b250927;

import java.util.Scanner;

public class b1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int y = 0;
		int m = 0;

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();

			y += 10 * (a / 30 + 1);
			m += 15 * (a / 60 + 1);
		}

		if (y < m) {
			System.out.println("Y " + y);
		} else if (y > m) {
			System.out.println("M " + m);
		} else {
			System.out.println("Y M " + y);
		}
	}
}