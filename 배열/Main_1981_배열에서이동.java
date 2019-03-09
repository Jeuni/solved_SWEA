import java.util.Scanner;

public class Main_1981_배열에서이동 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 2 <= n <= 100
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				find(i, j);
			}
		}
	} // end of main
	
	public static void find(int i, int j) {
		
	}
} // end of class
