package b250924;

import java.util.Scanner;

public class b1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int a = N;
		int count = 0;
		
		while(true) {
			a = (a%10) * 10 + (a/10 + a % 10)%10;
			count++;
			
			if(a == N) {
				break;
			}
		}
		System.out.println(count);
	}
}