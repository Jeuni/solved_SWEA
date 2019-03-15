import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_영준이와신비한뿔의숲 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine().trim());
		for (int testCase = 1; testCase <= T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[m+1][2];
			int i = 0;
			for (i = 0; i < arr.length; i++) {
				arr[i][0] = 2*i + (m-i)*1;
				if(arr[i][0] == n) {
					break;
				}
			}
			
			
			System.out.println("#"+testCase+" "+(m-i)+" "+i);
		}
	}
}
