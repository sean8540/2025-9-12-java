package b250924;

import java.util.Scanner;

public class b1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int wx = w - x;
		int hy = h - y;
		
		int min = x;
		
		if(min > y) {
			min = y;
		}

		if(min > hy) {
			min = hy;
		}
		
		if(min > wx) {
			min = wx;
		}
		
		System.out.println();
	}
}