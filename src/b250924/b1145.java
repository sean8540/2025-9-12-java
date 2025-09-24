package b250924;

import java.util.Scanner;

public class b1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int n = 1;
		
		while(true) {
			int count = 0;
			
			if(n%a==0) {
				count++;
			}
			if(n%b==0) {
				count++;
			}
			if(n%c==0) {
				count++;
			}
			if(n%d==0) {
				count++;
			}
			if(n%e==0) {
				count++;
			}
			
			if(count >=3) {
				System.out.println(n);
				break;
			}
			
			n++;
		}
	}
}