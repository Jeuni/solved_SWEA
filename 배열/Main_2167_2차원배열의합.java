import java.util.Scanner;

public class Main_2167_2차원배열의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt(); // 1 <= N,M <= 300
		
		int[][] arr = new int[N][M];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		} // 배열 입력
		
		int K = sc.nextInt();
		for (int n = 0; n < K; n++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int sum = 0;
			// i <= x, j <= y
			for (int l = i; l <= x; l++) { 
				for (int l2 = j; l2 <= y; l2++) {
					sum += arr[l-1][l2-1];
				}
			}
			System.out.println(sum);
		}
		
		
	} // end of main
} // end of class
