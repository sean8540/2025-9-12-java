package b250918;

import java.util.Scanner;

public class b5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[30];
		
		for(int i = 1; i <= 30; i++) {
			num[i-1] = i;
		}
		
		for(int i = 1; i <= 28; i++) {
			int a = sc.nextInt();
			if(num[a-1] == a) {
				num[a-1] = 0;
			}
		}
		for(int i = 1; i <= 30; i++) {
			if(num[i-1] != 0) {
				System.out.println(i);
			}
		}
	}
}