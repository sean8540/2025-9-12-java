package b250928;

import java.util.Scanner;

public class b1297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		double r = Math.sqrt(H*H + W*W);
		
		// (세로) 제곱  + (가로) 제곱 = (대각선) 제곱
		// 비율 => a
		// h*h*a*a + w*w*a*a = d*d
		// a*a(h*h + w*w) = d*d
		// a = d/루트(h*h + w*w) = d/r
		// a = d/r
		// 실제 세로 가로 => h * a, w * a
		// h * a = d/r * h, w * a = d/r * w
		
		int h = (int) ((D * H)/r);
		int w = (int) ((D * W)/r);
		
		System.out.println(h + " " + w);
	}
}