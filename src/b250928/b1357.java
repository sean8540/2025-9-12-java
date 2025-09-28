package b250928;

import java.util.Scanner;

public class b1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		String x = new StringBuilder(String.valueOf(X)).reverse().toString();
		String y = new StringBuilder(String.valueOf(Y)).reverse().toString();
		
		int rx = Integer.parseInt(x);
		int ry = Integer.parseInt(y);
		
		int xy = rx + ry;
		
		String rxy = new StringBuilder(String.valueOf(xy)).reverse().toString();
		
		int end = Integer.parseInt(rxy);
		
		System.out.println(end);
	}
}