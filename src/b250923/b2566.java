package b250923;

import java.util.Scanner;

public class b2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] n = new int[9][9];
		int max = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				n[i][j] = sc.nextInt();
				if(max < n[i][j]) {
					max = n[i][j];
				}
			}
		}
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if (max == n[i][j]) {
					System.out.println(max);
					System.out.println((i+1) + " " + (j+1));
					break;
				}
			}
		}
	}
}