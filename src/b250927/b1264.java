package b250927;

import java.util.Scanner;

public class b1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String En = sc.nextLine();
			int count = 0;
			
			String en = En.toLowerCase();
			
			if(en.equals("#")) {
				break;
			}
			
			for(int i = 0; i < en.length(); i++) {
				if(en.charAt(i) == 'a' || en.charAt(i) == 'e' || en.charAt(i) == 'o' ||
						en.charAt(i) == 'i' || en.charAt(i) == 'u') {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}