package b251002;

import java.util.Scanner;

public class b3029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String time1 = sc.next();
		String time2 = sc.next();
		
		String[] t1 = time1.split(":");
		String[] t2 = time2.split(":");
		
		int h1 = Integer.parseInt(t1[0]);
		int m1 = Integer.parseInt(t1[1]);
		int s1 = Integer.parseInt(t1[2]);
		
		int h2 = Integer.parseInt(t2[0]);
		int m2 = Integer.parseInt(t2[1]);
		int s2 = Integer.parseInt(t2[2]);
		
		int total1 = h1 * 3600 + m1 * 60 + s1;
		int total2 = h2 * 3600 + m2 * 60 + s2;
		
		if(total1 >= total2) {
			total2 += 24 * 3600;
		}
		
		int t = total2 - total1;
		
		int hh = t / 3600;
		int mm = (t % 3600) / 60;
		int ss = t % 60;
		
		System.out.printf("%02d:%02d:%02d", hh, mm, ss);
	}
}