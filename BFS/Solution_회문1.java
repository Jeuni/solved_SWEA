import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_회문1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] arr = new char[8][8];
		for (int testCase = 1; testCase <= 10; testCase++) {
			int len = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = br.readLine().trim().toCharArray();
			}
			
			int cnt = 0;
			Queue<Character> qR = new LinkedList<Character>();
			Queue<Character> qC = new LinkedList<Character>();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					qC.offer(arr[i][j]);
					qR.offer(arr[j][i]);
					if(qC.size() == len) {
						String s1 = "", s2 ="";
						for (int k = 0; k < len/2; k++) {
							char c = qC.poll();
							s1 += c;
							qC.offer(c);
							
						}
						if(len % 2 != 0) {
							char c = qC.poll();
							qC.offer(c);
						}
						for (int k = 0; k < len/2; k++) {
							char c = qC.poll();
							s2 = c + s2;
							qC.offer(c);
						}
						if(s1.equals(s2)) cnt++;
						qC.remove();
					}
					if(qR.size() == len) {
						String s1 = "", s2 ="";
						for (int k = 0; k < len/2; k++) {
							char c = qR.poll(); 
							s1 += c;
							qR.offer(c);
						}
						if(len%2 != 0) {
							char c = qR.poll();
							qR.offer(c);
						}
						for (int k = 0; k < len/2; k++) {
							char c = qR.poll(); 
							s2 = c + s2;
							qR.offer(c);
						}
						if(s1.equals(s2)) cnt++;
						qR.remove();
					}
				}
				qC.clear();
				qR.clear();
			}
			
			System.out.println("#"+testCase+" "+cnt);
		} // end of for testCase
	} // end of main
} // end of class
