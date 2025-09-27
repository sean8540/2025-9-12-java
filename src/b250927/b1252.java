package b250927;

import java.math.BigInteger;
import java.util.Scanner;

public class b1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		BigInteger A = new BigInteger(a, 2);
		BigInteger B = new BigInteger(b, 2);
		
		BigInteger C = A.add(B);
		
		System.out.println(C.toString(2));
	}
}