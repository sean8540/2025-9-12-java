package b251003;

import java.util.Scanner;

public class b3058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int min = 100;
			
			for(int j = 0; j < 7; j++) {
				int a = sc.nextInt();
				if(a % 2 == 0) {
					sum += a;
					if(a < min) {
						min = a;
					}
				}
			}
			System.out.println(sum + " " + min);
		}
	}
}