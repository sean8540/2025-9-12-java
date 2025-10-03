package b251003;

import java.util.Scanner;

public class b3460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int count = 0;

			String N = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
			
			for (int j = 0; j < N.length(); j++) {
				if (N.charAt(j) == '1') {
					System.out.print(count + " ");
				}
				count++;
			}
		}
	}
}