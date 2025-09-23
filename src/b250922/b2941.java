package b250922;

import java.util.Scanner;

public class b2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		
		String[] C = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String c : C) {
			r = r.replace(c, "a");
		}
		
		System.out.println(r.length());
	}
}