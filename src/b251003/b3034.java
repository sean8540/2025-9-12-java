package b251003;

import java.util.Scanner;

public class b3034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			
			if((a * a) <= (W * W) + (H * H)) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
	}
}