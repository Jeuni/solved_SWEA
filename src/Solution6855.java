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
			int index = arr.length / k;
			int sum = 0;
			int i = 0;
			int count = 0;
			for (i = index; i < arr.length && count < k; i += index) {
				if(i == 0) {
					break;
				} else if (i == index) {
					sum += (arr[i] - arr[0]);
				} else {
					sum += (arr[i] - arr[i - index + 1]);
				}
				count++;
			}
			if(count>= k && (i-index) < arr.length-1) {
				sum += arr[arr.length-1] - arr[i-index*2+1];
			}
			if(index >= arr.length) {
				sum += arr[arr.length-1] - arr[0];
			}
//			sum += ();

			System.out.println("#" + testCase + " " + sum);
		}
	}
}
