import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_추억의2048게임 {
	public static int[][] map;
	public static boolean[][] changed;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine().trim());
		for (int testCase = 1; testCase <= T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			String dir = st.nextToken();
			map = new int[N][N];
			changed = new boolean[N][N];
			for (int i = 0; i < map.length; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			} // map 초기화

			int[] d;
			switch (dir) {
			case "up":
				d = new int[] { -1, 0 };
				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < map.length; j++) {
						if (map[i][j] > 0) {
							push(i, j, d);
						}
					}
				}
				break;
			case "down":
				d = new int[] { 1, 0 };
				for (int i = map.length-1; i >= 0; i--) {
					for (int j = 0; j < map.length; j++) {
						if(map[i][j] > 0) {
							push(i, j, d);
						}
					}
				}
				break;
			case "left":
				d = new int[] { 0, -1 };
				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < map.length; j++) {
						if(map[j][i] > 0) {
							push(j, i, d);
						}
					}
				}
				break;
			case "right":
				d = new int[] { 0, 1 };
				for (int i = map.length-1; i >= 0; i--) {
					for (int j = 0; j < map.length; j++) {
						if(map[j][i] > 0) {
							push(j, i, d);
						}
					}
				}
				break;
			}
			System.out.println("#" + testCase);
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}

		} // end of for testCase
	} // end of main

	public static void push(int i, int j, int[] d) {
		int newI = i + d[0];
		int newJ = j + d[1];
		if (newI >= 0 && newI < map.length && newJ >= 0 && newJ < map.length) {
			if (map[newI][newJ] == 0) {
				map[newI][newJ] = map[i][j];
				map[i][j] = 0;
				push(newI, newJ, d);
			} else if(!changed[newI][newJ]){
				if(map[newI][newJ] == map[i][j]) {
					map[newI][newJ] += map[i][j];
					map[i][j] = 0;
					changed[newI][newJ] = true;
				}
			}
		}
	}

} // end of class
