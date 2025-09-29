package b250929;

import java.util.Scanner;

public class b2083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String name = sc.next();
			int a = sc.nextInt();
			int w = sc.nextInt();
			
			if(a == 0 && w == 0) {
				break;
			}
			
			if(a > 17 || w >= 80) {
				System.out.println(name + " " + "Senior");
			} else {
				System.out.println(name + " " + "Junior");
			}
		}
	}
}