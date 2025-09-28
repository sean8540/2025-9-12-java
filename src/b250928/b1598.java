package b250928;

import java.util.Scanner;

public class b1598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ax = (a-1)/4;
		int bx = (b-1)/4;
		
		int ay = (a-1)%4;
		int by = (b-1)%4;
		
		int A = Math.abs(ax - bx);
		int B = Math.abs(ay - by);
				
		System.out.println(A + B);
	}
}