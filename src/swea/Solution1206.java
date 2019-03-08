package swea;

import java.util.Scanner;

public class Solution1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int testCase = 1; testCase <= 10; testCase++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 2; i <= n-2; i++) {
//				if(arr[i] - arr[i-2] )
				arr[i]--;
			}
			
			System.out.println("#"+testCase+" ");
		}
	} // end of main
} // end of class
