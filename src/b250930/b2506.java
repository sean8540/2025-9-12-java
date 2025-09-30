package b250930;

import java.util.Scanner;

public class b2506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		int s = 0;
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			
			if(x == 1) {
				s++;
				sum += s;
			} else {
				s = 0;
			}
		}
		System.out.println(sum);
	}
}