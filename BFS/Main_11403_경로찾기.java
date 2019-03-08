import java.util.LinkedList;
import java.util.Scanner;

public class Main_11403_경로찾기 {
	public static int[][] G;
	public static boolean[] visited;
	public static LinkedList<Integer> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 1 <= N <= 100
		G = new int[N][N];
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G.length; j++) {
				G[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < G.length; i++) {
			visited = new boolean[N];
			q = new LinkedList<Integer>();
			BFS(i, i);
		}
		for (int k = 0; k < G.length; k++) {
			for (int i = 0; i < G.length; i++) {
				System.out.print(G[k][i]+" ");
			}
			System.out.println();
		}
	} // end of main
		
	public static void BFS(int s, int cs) {
		for (int i = 0; i < G.length; i++) {
			if(!visited[i] && G[cs][i] == 1) {
				q.add(i);
				visited[i] = true;
			}
		}
		while(!q.isEmpty()) {
			int v = q.poll();
			G[s][v] = 1;
			BFS(s, v);
		}
	}
	
} // end of class
