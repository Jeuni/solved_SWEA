import java.util.Scanner;

/**
 * 6719. 성수의 프로그래밍 강좌 시청 D4
 * 2019-02-07
 */
public class Solution6719 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int testCase = 1; testCase <= T; testCase++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] course = new int[n];
			for (int i = 0; i < course.length; i++) {
				course[i] = sc.nextInt();
			}
			for (int i = 0; i < course.length-1; i++) {
				for (int j = i; j < course.length; j++) {
					if(course[j] < course[i]) {
						int tmp = course[j];
						course[j] = course[i];
						course[i] = tmp;
					}
				}
			}
			
			double A = 0;
			for(int i = course.length-k; i < course.length; i++) {
				A = (A+course[i])/2;
			}
			
			System.out.println("#"+testCase+String.format(" %.6f",A));
		}
	}
}
