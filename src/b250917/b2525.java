package b250917;

import java.util.Scanner;

public class b2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = a*60 + b + c;
		int hour = (sum/60)%24;
		int minutes = sum % 60;
		
		System.out.println(hour + " " + minutes);
	}
}