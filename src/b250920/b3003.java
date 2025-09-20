package b250920;

import java.util.Scanner;

public class b3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = {1, 1, 2, 2, 2, 8};
		int[] b = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int num = sc.nextInt();
			b[i] = a[i] - num;
			System.out.print(b[i] + " ");
		}
	}
}