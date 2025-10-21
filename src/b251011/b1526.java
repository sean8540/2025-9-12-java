package b251011;

import java.util.Scanner;

public class b1526 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = N; i >= 4; i--) {
			int t = i;
			boolean ok = true;
			
			while(t > 0) {
				int d = t % 10;
				if(d != 4 && d != 7) {
					ok = false;
					break;
				}
				t /= 10;
			}
			
			if(ok) {
				System.out.println(i);
				break;
			}
		}
	}
}