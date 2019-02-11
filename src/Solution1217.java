import java.util.Scanner;

/**
 * 2019-01-31
 * 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱 D3
 */
public class Solution1217 {
	public static int mul(int a, int b) {
		if(b <= 1) {
			return a;
		} else {
			return a*mul(a,--b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int testCase = 1; testCase <= 10; testCase++) {
			testCase = sc.nextInt();
			int a= sc.nextInt();
			int b = sc.nextInt();
			
			
			System.out.println("#"+testCase+" "+mul(a,b));
		}
	}
}
