import java.util.Scanner;

/**
 * 1213. [S/W 문제해결 기본] 3일차 - String D3
 */

public class Solution1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int testCase = 1; testCase <= 10; testCase++) {
			testCase = sc.nextInt();
			String s = sc.next(); // 검색용 문자열
			String targets = sc.next();

			char[] c = s.toCharArray();
			char[] targetc = targets.toCharArray();
			int count = 0;
			int j = 0;
			for (int i = 0; i < targetc.length; i++) {
				if(c[j] == targetc[i] && j < c.length) {
					j++;
					if(j == c.length) {
						count++;
						j = 0;
					}
				} else {
					j = 0;
					if(c[j] == targetc[i])
						j++;
				}
			}

				System.out.println("#" + testCase + " " + count);
		}
	} // end of main
} // end of class
