package b250920;

import java.util.Scanner;

public class b9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			String l = sc.next();
			
			System.out.print(l.charAt(0));
			System.out.println(l.charAt(l.length()-1));
		}
	}
}