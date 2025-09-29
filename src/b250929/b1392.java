package b250929;

import java.util.Scanner;

public class b1392 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		int[] a = new int[N];
		int[] t = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		t[0] = a[0];
		for (int i = 1; i < N; i++) {
			t[i] = t[i - 1] + a[i];
		}

		for (int i = 0; i < Q; i++) {
			int q = sc.nextInt();
			for (int j = 0; j < N; j++) {
				if (q < t[j]) {
					System.out.println(j + 1);
					break;
				}
			}
		}
	}
}