import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_파이프연결 {
	public static int N;
	public static int[][] connected;
	public static boolean[][] visited;
	public static int[][] map;
	public static int[][] pipe = { { 0, 0 }, { 3, 4 }, { 1, 2 }, { 2, 4 }, { 3, 2 }, { 3, 1 }, { 1, 4 } };
	public static int[][] dir = { {}, { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine().trim());
		// 연결된 부분 : 1234 상하좌우
		for (int testCase = 1; testCase <= T; testCase++) {
			N = Integer.parseInt(br.readLine().trim());
			map = new int[N][N];
			connected = new int[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < map.length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < map.length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
				System.out.println(Arrays.toString(map[i]));
			}

			int c = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (!visited[i][j] && map[i][j] > 0) {
						c++;
						bfs(i, j, c);
					}
				}
			}
			
			for (int i = 0; i < connected.length; i++) {
				System.out.println(Arrays.toString(connected[i]));
			}

			System.out.println("#" + testCase + " ");
		} // end of testCase
	} // end of main

	public static void bfs(int y, int x, int no) {
		Queue<int[]> q = new LinkedList<int[]>();
		visited[y][x] = true;
		connected[y][x] = no;
		q.offer(new int[] { y, x });
		while (!q.isEmpty()) {
			int[] current = q.poll();
			int nowY = current[0];
			int nowX = current[1];
			int d = map[nowY][nowX];
			int newY = current[0] + dir[pipe[d][1]][0];	
			int newX = current[1] + dir[pipe[d][1]][1];	
			if(newX >= 0 && newX < N && newY >= 0 && newY < N
					&& !visited[newY][newX]) {
				visited[newY][newX] = true;
				d = map[newY][newX];
//				if(nowX < newX) { // 상하로 이동
//					
//				} else { // 좌우로 읻
//					
//					
//				}
				if(newY+dir[pipe[d][0]][0] == nowY && (newX+dir[pipe[d][0]][1] == nowX)) {
					connected[newY][newX] = no;
					q.offer(new int[] { newY, newX });
				}
			}
		}
	}
} // end of class
