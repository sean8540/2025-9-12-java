package b250930;

import java.util.Scanner;

public class b2857 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int i = 1; i <= 5; i++) {
			String s = sc.next();
			
			if(s.contains("FBI")) {
				System.out.print(i + " ");
				count++;
			}
			
		}
		
		if(count == 0) {
			System.out.println("HE GOT AWAY!");
		}
	}
}