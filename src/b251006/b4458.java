package b251006;

import java.util.Scanner;

public class b4458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0;  i < n; i++) {
			String w = sc.nextLine();
			
			if(w.length() > 0) {
				char first = Character.toUpperCase(w.charAt(0));
				String next = w.substring(1);
				System.out.println(first + next);
			} else {
				System.out.println();
			}
		}

	}
}