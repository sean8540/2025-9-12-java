package b250923;

import java.util.Scanner;

public class b2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= a; i++) {
			if(a%i == 0) {
				count++;
			}
			if(count == b) {
				System.out.println(i);
				break;
			} else if(i == a && count < b) {
				System.out.println("0");
			}
		}
	}
}