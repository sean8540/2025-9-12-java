package b251006;

import java.util.Scanner;

public class b4470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= N; i++) {
			String w = sc.nextLine();
			System.out.println(i + ". " + w);
		}
	}
}