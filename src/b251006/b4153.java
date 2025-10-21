package b251006;

import java.util.Scanner;

public class b4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int max = Math.max(a,Math.max(b, c));
			int x = 0;
			int y = 0;
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if(max == a) {
				x = b;
				y = c;
			} else if(max == b) {
				x = a;
				y = c;
			} else {
				x = a;
				y = b;
			}
			
			if(x*x + y*y == max*max) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}