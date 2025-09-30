package b250930;

import java.util.Scanner;

public class b2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		double sum = 0;
		
		if(s.charAt(0) == 'A') {
			sum += 4;
		} else if(s.charAt(0) == 'B') {
			sum += 3;
		} else if(s.charAt(0) == 'C') {
			sum += 2;
		} else if(s.charAt(0) == 'D') {
			sum += 1;
		} else if(s.charAt(0) == 'F') {
			sum = 0;
		}

		if(s.length() == 2) {
			if(s.charAt(1) == '+') {
				sum += 0.3;
			} else if(s.charAt(1) == '-') {
				sum -= 0.3;
			}
		}
		
		System.out.println(sum);
	}
}