package b251002;

import java.math.BigInteger;
import java.util.Scanner;

public class b2935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		String c = sc.next();
		BigInteger B = sc.nextBigInteger();
		
		if(c.equals("*")) {
			System.out.println(A.multiply(B));
		} else {
			System.out.println(A.add(B));
		}
	}
}