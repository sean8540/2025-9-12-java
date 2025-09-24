package b250924;

import java.util.Scanner;

public class b1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int min = 1000000; 
		int max = 2;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			if(min > a) {
				min = a;
			}
			
			if(max < a) {
				max = a;
			}
		}
		System.out.println(min * max);
	}
}