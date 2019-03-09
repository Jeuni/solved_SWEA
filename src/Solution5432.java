import java.util.Scanner;

/**
 * 5432. 쇠막대기 자르기 D4
 * 2019-02-07
 */
public class Solution5432 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		for(int testCase = 1; testCase <= T; testCase++) {
			String str = sc.nextLine();
			char[] arr = str.toCharArray();
			char[] stack = new char[arr.length];
			int top = 0, sum = 0;
			boolean lazar = true;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == '(') {
					stack[++top] = arr[i];
					lazar = true;
				} else if(arr[i] == ')' && lazar) {
					top--;
					sum += top;
					lazar = false;
				} else {
					top--;
					sum += 1;
				}
			}
			System.out.println("#"+testCase+" "+sum);
		}
	}
}
