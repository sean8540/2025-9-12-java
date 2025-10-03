package b251003;

import java.util.Scanner;

public class b3449 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			String a = sc.next();
			String b = sc.next();
			int count = 0;
			
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) != b.charAt(j)) {
						count++;
				}
			}
			System.out.println("Hamming distance is " + count + ".");
		}
	}
}