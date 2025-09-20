package b250920;

import java.util.Scanner;

public class b2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int a  = sc.nextInt();
			String b = sc.next();
			for(int j = 0; j < b.length(); j++) {
				for(int l = 0; l < a; l++) {
					System.out.print(b.charAt(j));
				}
			}
			System.out.println();
		}
	}
}