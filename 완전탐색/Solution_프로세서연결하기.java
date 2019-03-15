import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_프로세서연결하기 {
	public static int[][] map;
	public static boolean[][] visited;
	public static int step;
	public static int[] R = { -1, 1, 0, 0};
	public static int[] C = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine().trim());
		for (int testCase = 1; testCase <= T; testCase++) {
			int N = Integer.parseInt(br.readLine().trim());
			map = new int[N][N]; 
			StringTokenizer st;
			for (int i = 0; i < map.length; i++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
//				System.out.println(Arrays.toString(map[i]));
			} // 입력 초기화
			
			ArrayList<int[]> core = new ArrayList<int[]>();
			for (int i = 0; i < map.length; i++) {
				visited = new boolean[N][N]; 
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j] == 1) {
						core.add(new int[] {i, j});
					}
				}
			}
			core.addAll((ArrayList<int[]>) core.clone());
//			for (int i = 0; i < core.size(); i++) {
//				System.out.println(Arrays.toString(core.get(i)));
//			}
			int front = -1, rear = core.size()/2-1;
			
			int min = Integer.MAX_VALUE;
			
			System.out.println("#"+testCase+" "+min);
		} // end of for testCase
	} // end of main
	

} // end of class
