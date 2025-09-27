package b250927;

import java.math.BigInteger;
import java.util.Scanner;

public class b1247 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			BigInteger sum = BigInteger.ZERO;
			
			for(int j = 0; j < a; j++) {
				BigInteger n = sc.nextBigInteger();
				sum = sum.add(n);
			}
			
			if(sum.equals(BigInteger.ZERO)) {
				System.out.println("0");
			} else if(sum.signum() > 0) {
				System.out.println("+");
			} else if(sum.signum() < 0) {
				System.out.println("-");
			}
		}
	}
}