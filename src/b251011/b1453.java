package b251011;

import java.util.Scanner;

public class b1453 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] com = new int[101];
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int n = sc.nextInt();
			if(com[n] == 1) {
				count++;
			} else {
				com[n] = 1;
			}
		}
		System.out.println(count);
	}
}