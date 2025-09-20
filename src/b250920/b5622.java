package b250920;

import java.util.Scanner;

public class b5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String l = sc.next();
		int sum = 0;
		
		for(int i = 0; i < l.length(); i++) {
			if(l.charAt(i) <= 67) {
				sum += 3;
			} else if(l.charAt(i) <= 70) {
				sum += 4;
			} else if(l.charAt(i) <= 73) {
				sum += 5;
			} else if(l.charAt(i) <= 76) {
				sum += 6;
			} else if(l.charAt(i) <= 79) {
				sum += 7;
			} else if(l.charAt(i) <= 83) {
				sum += 8;
			} else if(l.charAt(i) <= 86) {
				sum += 9;
			} else if(l.charAt(i) <= 90) {
				sum += 10;
			}
		} 
		System.out.println(sum);
	}
}