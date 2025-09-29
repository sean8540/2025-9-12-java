package b250929;

import java.util.Scanner;

public class b2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		long m = Math.abs(M - N);
		
		System.out.println(m);
	}
}