package b250923;

import java.util.Scanner;

public class b9506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int count = 0;
			
			if(a == -1) {
				break;
			}
			
			for(int i = 1; i < a; i++) {
				if(a % i == 0) {
					count += i;
				}
			}
			
			if(count == a) {
				System.out.print(a + " = ");
				boolean first = true;
				
				for(int i = 1; i < a; i++) {
					if(a % i == 0) {
						if(!first) {
							System.out.print(" + ");
						}
						System.out.print(i);
						first = false;
					}
				}
				System.out.println();
			} else {
				System.out.println(a + " is NOT perfect.");
			}
		}
	}
}