package b250927;

import java.util.Scanner;

public class b1236 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String[][] c = new String[N][M];
		
		for(int i = 0; i < N; i++) {
			String line = sc.next();
			for(int j = 0; j < M; j++) {
				c[i][j] = line.substring(j,j+1);
			}
		}
		
		int row = 0;
		int col = 0;
		
		for(int i = 0; i < N; i++) {
			boolean r = false;
			for(int j = 0; j < M; j++) {
				if(c[i][j].equals("X")) {
					r = true;
					break;
				}
			}
			if(!r) {
				row++;
			}
		}
		
		for(int i = 0; i < M; i++) {
			boolean co = false;
			for(int j = 0; j < N; j++) {
				if(c[j][i].equals("X")) {
					co = true;
					break;
				}
			}
			if(!co) {
				col++;
			}
		}
		
		System.out.println(Math.max(row, col));
	}
}