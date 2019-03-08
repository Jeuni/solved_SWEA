import java.util.Scanner;

/**
 * 6855. 신도시 전기 연결하기 D4 2019-02-07
 */
public class Solution6855 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int testCase = 1; testCase <= T; testCase++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int index = n/k;
			int sum = 0;
			if (index <= 1) {
				sum = 0;
			} else {
				int i = 0, ind = index;
				for (i = 0; i < arr.length && ind < arr.length; i++) {
					sum += (arr[ind] - arr[i]);
					i += index;
					ind += index;
				}
				if((i-index-1) < arr.length-1) {
					sum += arr[arr.length-1] - arr[i-index-1];
				}
			}


			System.out.println("#" + testCase + " " + sum);
		}
	}
}
