package b250928;

import java.util.Scanner;

public class b1547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] c = new int[3];
		c[0] = 1;

		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = 0;
			
			x = c[a-1];
			c[a-1] = c[b-1];
			c[b-1] = x;
		}
		
		for(int i = 0; i < 3; i ++) {
			if(c[i] == 1) {
				System.out.println(i+1);
				break;
			}
		}
	}
}