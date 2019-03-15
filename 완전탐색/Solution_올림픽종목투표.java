import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_올림픽종목투표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine().trim());
		for (int testCase = 1; testCase <= T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // 종목
			int m = Integer.parseInt(st.nextToken()); // 조직위원
			int[] A = new int[n]; // 개최 비용 저장
			int[] B = new int[m]; // 조직 위원별 상한 비용
			int[] count = new int[n];
			int max = 0, maxIndex = 0;
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < B.length; i++) {
				B[i] = Integer.parseInt(st.nextToken());
				for (int j = 0; j < A.length; j++) {
					if (A[j] <= B[i]) {
						count[j]++;
						if(count[j] > max) {
							max = count[j];
							maxIndex = j;
						}
						break;
					}
				}
			}
			System.out.println("#"+testCase+" "+(maxIndex+1));
		}
	}
}
