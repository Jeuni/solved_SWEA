package swea;

import java.util.Scanner;

/**
 * 1210 S/W 문제해결 기본 2일차 - Ladder1 (D4)
 */

public class Solution1210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int testCase = 1; testCase <= 10; testCase++) {
			testCase = sc.nextInt();
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int result = 0, j = 0; // 출발지 저장
			boolean left = false, right = false; // 현재 이동 방향
			d: for (int k = 0; k < 100; k++) {
				if (arr[0][k] == 1) {
					int i = 0;
					j = k;
					result = k;

					while (i < 99) {
						if (j == 0) { // 첫 번째 열
							if (arr[i][j + 1] > 0) {
								j++;
								right = true;
							} else {
								i++;
								left = false;
								right = false;
							}
						} else if (j == 99) { // 마지막 열
							if (arr[i][j - 1] > 0) {
								j--;
								left = true;
							} else {
								i++;
								left = false;
								right = false;
							}
						} else {
							if (arr[i][j + 1] > 0 && left == false) {
								right = true;
								j++;
							} else if (arr[i][j - 1] > 0 && right == false) {
								j--;
								left = true;
							} else {
								i++;
								left = false;
								right = false;
							}
						}
					}
					if (arr[i][j] == 2) {
						break d;
					}
				}
			}
			System.out.println("#" + testCase + " " + result);
		}
	} // end of main
} // end of class
