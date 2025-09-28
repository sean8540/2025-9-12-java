package b250928;

import java.util.Scanner;

public class b1362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;

		while (true) {
			int o = sc.nextInt();
			int w = sc.nextInt();

			if (o == 0 && w == 0) {
				break;
			}
			
			boolean dead = false;
			
			while (true) {
				String c = sc.next();
				int n = sc.nextInt();

				if (c.equals("#") && n == 0) {
					if (w <= 0 || dead) {
						System.out.println(num + " RIP");
					} else if (w > o / 2 && w < 2 * o) {
                        System.out.println(num + " :-)");
                    } else {
                        System.out.println(num + " :-(");
                    }
					num++;
					break;
				}

				if(!dead) {
					if (c.equals("E")) {
						w = w - n;
					} else if (c.equals("F")) {
						w = w + n;
					}
				}
				
				if (w <= 0) {
					dead = true;
				}
			}
		}
	}
}