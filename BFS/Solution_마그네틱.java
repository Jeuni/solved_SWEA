import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_마그네틱 {
	public static int[][] table;
	public static boolean[][] moved;
	public static int cnt;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int N = Integer.parseInt(br.readLine().trim());
			
			cnt = 0;
			table = new int[N][N];
			for (int i = 0; i < table.length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < table[i].length; j++) {
					table[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					if(table[i][j] == 1) { // N극
						int[] d = {-1, 0};
						bfs(i, j, d);
					} else if(table[i][j] == 2) { // S극
						int[] d = {1, 0};
						bfs(i, j, d);
					}
				}
			}
			
			System.out.println("#"+testCase+" "+cnt);
		} // end of for testCase
	} // end of main
	
	public static void bfs(int y, int x, int[] dir) {
		int newY = y+dir[0];
		int newX = x+dir[1];
		if(newX >=0 && newX < table.length && newY >= 0 && newY < table.length) {
			if(table[newY][newX] == 0) {
				table[newY][newX] = table[y][x]; 
				table[y][x] = 0;
				bfs(newY, newX, dir);
			} else if(table[newY][newX] != table[y][x]){
				cnt++;
			}
		} else { // 극에 붙음
			table[y][x] = 0;
		}
	}
} // end of class
