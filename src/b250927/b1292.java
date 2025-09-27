package b250927;

import java.util.Scanner;

public class b1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int[] n = new int[1000];
		int sum = 0;
		
		for(int i = 1; sum < 1000; i++) {
			for(int j = 0; j < i ; j++) {
				if(sum >= 1000) {
					break;
				}
				n[sum]= i;
				sum ++;
			}
		}
		
		int result = 0;
		
		for(int i = A-1; i <= B-1; i++) {
			result += n[i];
		}

		System.out.println(result);
	}
}