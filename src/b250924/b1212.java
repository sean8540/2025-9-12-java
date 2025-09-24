package b250924;

import java.math.BigInteger;
import java.util.Scanner;

public class b1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		
		BigInteger e = new BigInteger(N,8);
		
		String t = e.toString(2);
		
		System.out.println(t);
	}
}