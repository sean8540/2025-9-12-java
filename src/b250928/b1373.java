package b250928;

import java.math.BigInteger;
import java.util.Scanner;

public class b1373 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String t = sc.next();
		
		BigInteger T = new BigInteger(t,2);
		
		String e = T.toString(8);
		
		System.out.println(e);
	}
}