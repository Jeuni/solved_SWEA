import java.util.Scanner;

public class Main_11728_배열합치기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		int M = sc.nextInt(); // 1 <= N, M <= 1,000,000
		int[] A = new int[N];
		int[] B = new int[M];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}
		
		int i = 0, j = 0;
		StringBuilder sb = new StringBuilder();
		while(i < A.length && j < B.length) {
			if(A[i] < B[j]) {
				sb.append(A[i++]+" ");
			} else {
				sb.append(B[j++]+" ");
			}
		}
		if(i < A.length) {
			for (int k = i; k < A.length; k++) {
				sb.append(A[i++]+" ");
			}
		}
		if(j < B.length) {
			for (int k = j; k < B.length; k++) {
				sb.append(B[j++]+" ");
			}
		}
		System.out.println(sb);
	} // end of main
} // end of class
