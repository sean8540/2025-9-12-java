package b251003;

import java.util.Scanner;

public class b3004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 2 == 0) {
			int a = ((N + 2) / 2) *  ((N + 2) / 2);
			System.out.println(a);
		} else {
			int a =  ((N + 2) / 2) *  (((N + 2) / 2) + 1);
			System.out.println(a);
		}
	}
}