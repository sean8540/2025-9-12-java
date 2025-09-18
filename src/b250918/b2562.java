package b250918;

import java.util.Scanner;

public class b2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[9];
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < 9; i++) {
			N[i] = sc.nextInt();
			if(max < N[i]) {
				max = N[i];
			}
		}
		for(int i = 0; i < 9; i++) {
			count ++;
			if(max == N[i]) {
				break;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}