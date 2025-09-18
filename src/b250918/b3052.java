package b250918;

import java.util.Scanner;

public class b3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] r = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			r[i] = a%42;
		}
		for(int i = 0; i <= 9; i++) {
			boolean e = false;
			for(int j = 0; j < i; j++) {
				if(r[i] == r[j]) {
					e = true;
					break;
				} 
			}
			if(!e) {
				count++;
			}
		}
		System.out.println(count);
	}
}