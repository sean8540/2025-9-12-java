package b250927;

import java.util.Scanner;

public class b1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		
		int h = m;
		int time = 0;
		int ex = 0;
		
		if(m + T > M) {
			System.out.println(-1);
			return;
		}
		
		while(ex < N) {
			
			if(h + T <= M) {
				h += T;
				ex++;
			} else {
				h -= R;
				if(h < m) {
					h = m;
				}
			}
			time++;
		}
		System.out.println(time);
	}
}