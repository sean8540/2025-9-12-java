package b250924;

import java.util.Scanner;

public class b1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		int b = sc.nextInt();

		a = a/100 * 100;
		int i = 0;
		
		while(true) {			
			if((a + i)%b == 0) {
				if((a + i) % 100 < 10) {
					System.out.println("0" + (a + i)%100);
				} else {
					System.out.println((a + i)%100);
				}
				break;
			}
			
			i++;
		}
	}
}