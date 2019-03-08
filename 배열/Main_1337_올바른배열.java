import java.util.Arrays;
import java.util.Scanner;

public class Main_1337_올바른배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 1 <= N <= 10,000
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 정렬
		int min = Integer.MAX_VALUE;
		if(arr[0] <= 5) {
			min = 4;
		}
		for (int i = 1; i < arr.length; i++) {
			int count = 1;
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				if(sum + arr[j] - arr[j-1] < 5) {
					sum += arr[j] - arr[j-1];
					count++;
				} else {
					break;
				}
			}
			if(5-count < min) {
				min = 5-count;
			}
		}
		System.out.println(min);
	} // end of main
} // end of class
