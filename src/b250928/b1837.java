package b250928;

import java.math.BigInteger;
import java.util.Scanner;

public class b1837 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger P = sc.nextBigInteger();
		int K = sc.nextInt();
		
		BigInteger min = P;
		
		for(int i = 2; i < K; i++) {
			if(P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
				System.out.println("BAD " + i);
				return;
			}
		}
		System.out.println("GOOD");
	}
}