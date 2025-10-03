package b251002;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b2959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[4];
		
		for(int i = 0; i < 4; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0] * num[2]);
	}
}