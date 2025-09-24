package b250924;

import java.util.Scanner;

public class b1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		long n1 = 0;
		long n2 = 0;
		long n3 = 0;

		switch (a) {
		case "black": n1 = 0;
			break;
		case "brown": n1 = 1;
			break;
		case "red": n1 = 2;
			break;
		case "orange": n1 = 3;
			break;
		case "yellow": n1 = 4;
			break;
		case "green": n1 = 5;
			break;
		case "blue": n1 = 6;
			break;
		case "violet": n1 = 7;
			break;
		case "grey": n1 = 8;
			break;
		case "white": n1 = 9;
			break;
		}
		
		switch (b) {
		case "black": n2 = 0;
			break;
		case "brown": n2 = 1;
			break;
		case "red": n2 = 2;
			break;
		case "orange": n2 = 3;
			break;
		case "yellow": n2 = 4;
			break;
		case "green": n2 = 5;
			break;
		case "blue": n2 = 6;
			break;
		case "violet": n2 = 7;
			break;
		case "grey": n2 = 8;
			break;
		case "white": n2 = 9;
			break;
		}

		switch (c) {
		case "black": n3 = 1;
			break;
		case "brown": n3 = 10;
			break;
		case "red": n3 = 100;
			break;
		case "orange": n3 = 1000;
			break;
		case "yellow": n3 = 10000;
			break;
		case "green": n3 = 100000;
			break;
		case "blue": n3 = 1000000;
			break;
		case "violet": n3 = 10000000;
			break;
		case "grey": n3 = 100000000;
			break;
		case "white": n3 = 1000000000;
			break;
		}
		
		System.out.println(((n1 * 10) + n2) * n3);
	}
}