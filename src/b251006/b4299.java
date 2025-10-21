package b251006;

import java.util.Scanner;

public class b4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int mi = sc.nextInt();
		
		// sum = a + b
		// mi = a - b
		
		if((sum + mi) % 2 == 0 && (sum - mi) % 2 == 0) {
			int a = (sum + mi) / 2;
			int b = (sum - mi) / 2;
			
			if(a >= 0 && b >= 0) {
				System.out.println(a + " " + b);
			} else {
				System.out.println("-1");
			}
		} else {
			System.out.println("-1");
		}
	}
}