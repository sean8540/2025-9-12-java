package b250923;

import java.util.Scanner;

public class b2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[][] m = new int[100][100];
//		for(int i = 0; i <100; i++) {
//			for(int j = 0; j < 100; j++) {
//				m[i][j] = 0;
//			}
//		}
//		
//		int n = sc.nextInt();
//		
//		for(int i = 0; i < n; i ++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			for(int l = a; l < a + 10; l++) {
//				for(int j = b; j < b + 10; j++) {
//					if(m[l][j] != 1) {
//						m[l][j] = 1;
//					}
//				}
//			}
//		}
//		
//		int count = 0;
//		
//		for(int l = 0; l < 100; l++) {
//			for(int j = 0; j < 100; j++) {
//				if(m[l][j] == 1) {
//					count++;
//				}
//			}
//		}
//		
//		System.out.println(count);

        int[][] m = new int[100][100]; // 자동 0 초기화

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int a = x; a < x + 10; a++) {
                for (int b = y; b < y + 10; b++) {
                    m[a][b] = 1; // 단순하게 1로 표시
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                count += m[i][j]; // 1이면 더하고, 0이면 0이라서 바로 합산
            }
        }

        System.out.println(count);
	}
}