package b250928;

import java.util.Scanner;

public class b1703 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			
			if(a == 0) {
				break;
			}
			
			int l = 1;
			
			for(int i = 0; i < a; i++) {
				int s = sc.nextInt();
				int c = sc.nextInt();
				
				l = l * s - c;
			}
			
			System.out.println(l);
		}
	}
}