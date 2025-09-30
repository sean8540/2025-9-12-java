package b250930;

import java.util.Scanner;

public class b2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] train = new int[4];
		int max = 0;
		
		int O = sc.nextInt();
		int I = sc.nextInt();
		
		train[0] = I;
		if(max < train[0]) {
			max = train[0];
		}
		
		for(int i = 1; i < 4; i++) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			
			train[i] = train[i-1] - out + in;
			
			if(train[i] > max) {
				max = train[i];
			}
		}

		System.out.println(max);
	}
}