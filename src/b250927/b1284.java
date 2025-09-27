package b250927;

import java.util.Scanner;

public class b1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int sum = 2;
			
			String num = sc.next();
			
			if(num.equals("0")) {
				break;
			}
			
			for(int i = 0; i < num.length(); i++) {
				if(num.charAt(i) == '1') {
					sum += 2;
				} else if(num.charAt(i) == '0') {
					sum += 4;
				} else {
					sum += 3;
				}
			}
			
			System.out.println(sum + num.length() -1);
		}
	}
}