package swea;

import java.util.Scanner;

/**
 * 1209 [S/W 문제해결 기본] 2일차 - Sum
 * @author student
 *
 */

public class Solution1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int testCase = 1; testCase <= 10; testCase++) {
			testCase = sc.nextInt();
			int[][] arr = new int[100][100];
			int max = Integer.MIN_VALUE;
			for(int i=0; i<100; i++) {
				int rsum = 0;
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
					rsum += arr[i][j];
				}
				if(rsum > max) 
					max = rsum;
			}
			int sum1 = 0, sum2 = 0;
			for(int j=0; j<100; j++) {
				int csum = 0;
				for(int i=0; i<100; i++) {
					csum += arr[i][j];
				}
				sum1 += arr[j][j];
				sum2 += arr[99-j][j];
				if(csum > max) 
					max = csum;
			}
			if(sum1 > max) 
				max = sum1;
			if(sum2 > max)
				max = sum2;
			
			
			System.out.println("#"+testCase+" "+max);
		}
	} // end of main
} // end of class
