import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_11724_연결요소의개수_김지은 {
	public static boolean[] visited;
	public static int[][] G;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 정점의 수
		int M = sc.nextInt(); // 간선의 수
		
		G = new int[N+1][N+1];
		for (int i = 0; i < M; i++) {
			G[sc.nextInt()][sc.nextInt()] = 1;
		}
		
		visited = new boolean[N];
		for (int i = 1; i < G.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				bfs(i);
			}
		}
	} // end of main
	
	public static void bfs(int s) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < G[s].length; i++) {
			if(G[s][i] == 1) {
				q.add(i);
			}
		}
	}
	
} // end of class
