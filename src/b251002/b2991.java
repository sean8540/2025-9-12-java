package b251002;

import java.util.Scanner;

public class b2991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int P = sc.nextInt();
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum1 = A + B;
		int sum2 = C + D;
		
		int countp = 0;
		int countm = 0;
		int countn = 0;
		
		if(P %  sum1 > 0 && P % sum1 <= A) {
			countp++;
		}
		if(P %  sum2 > 0 && P % sum2 <= C) {
			countp++;
		}
		
		if(M %  sum1 > 0 && M % sum1 <= A) {
			countm++;
		}
		if(M %  sum2 > 0 && M % sum2 <= C) {
			countm++;
		}
		
		if(N %  sum1 > 0 && N % sum1 <= A) {
			countn++;
		}
		if(N %  sum2 > 0 && N % sum2 <= C) {
			countn++;
		}
		
		System.out.println(countp);
		System.out.println(countm);
		System.out.println(countn);
	}
}