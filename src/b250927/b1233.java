package b250927;

import java.util.Scanner;

public class b1233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();
		
		int[] total = new int[S1 + S2 + S3 + 1];
		
		for(int i = 0; i < S1; i++) {
			for(int j = 0; j < S2; j++) {
				for(int l = 0; l < S3; l++) {
					total[(i+1) + (j+1) + (l+1)] ++;
				}
			}
		}
		
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < S1 + S2 + S3; i++) {
			if(max < total[i]) {
				max = total[i];
				sum = i;
			}
		}
		
		
		System.out.println(sum);
	}
}