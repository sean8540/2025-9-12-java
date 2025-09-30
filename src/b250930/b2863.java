package b250930;

import java.util.Scanner;

public class b2863 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		
		double[] t = new double[4];
		
		t[0] = A/C + B/D;
		t[1] = C/D + A/B;
		t[2] = D/B + C/A;
		t[3] = B/A + D/C;
		
		double max = t[0];
		int c = 0;
		
		for(int i = 1; i < 4; i++) {
			if(t[i] > max) {
				max = t[i];
				c = i;
			}
		}
		
		System.out.println(c);
	}
}