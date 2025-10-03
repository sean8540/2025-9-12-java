package b251003;

import java.util.Scanner;

public class b2765 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while(true) {
			double r = sc.nextDouble();
			int count = sc.nextInt();
			double time = sc.nextDouble();
			
			if(count == 0) {
				break;
			}
			
			double cir = r * Math.PI;
			double distance = (cir * count) / (5280 * 12);
			double MPH = distance / (time / 3600);
			
			System.out.printf("Trip #%d: %.2f %.2f\n", num, distance, MPH);
			
			num++;
		}
	}
}