import java.util.Arrays;
import java.util.Scanner;

/**
 * 1215. [S/W 문제해결 기본] 3일차 - 회문1 D3
 */
public class Solution1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int testCase = 1; testCase <= 10; testCase++) {
			int l = sc.nextInt();
			int[] arr = new int[l];
			char[][] pane = new char[8][];
			for (int i = 0; i < pane.length; i++) {
				pane[i] = sc.next().toCharArray();
			}
			int front = 0;
			int end = l-1;
			int count = 0;
			
			
			
			if(l%2 == 0) { // 길이가 짝수인 경우
				for (int i = 0; i < pane.length; i++) {//가로 검사
					int mid = front + l/2;
					while(end < pane.length) {
						if(pane[i][front] == pane[i][end]) {// 팰린드롬 찾는중
							int f = front, e = end;
							while(f < mid && mid <= e) {
								if(pane[i][++f] != pane[i][--e]) {
									break;
								}
							}
							if(e==mid-1) {
								count++;
							}
							front++;
							end++;
						} else {// 못찾음
							front++;
							end++;
						}
						front++;
						end++;
					}
					front = 0;
					end = l-1;
				}
				for (int i = 0; i < pane.length; i++) {//세로 검사
					int mid = front + l/2;
					while(end < pane.length) {
						if(pane[front][i] == pane[end][i]) {// 팰린드롬 찾는중
							int f = front, e = end;
							while(f < mid && mid <= e) {
								if(pane[++f][i] != pane[--e][i]) {
									break;
								}
							}
							if(e==mid-1) {
								count++;
							}
							front++;
							end++;
						} else {// 못찾음
							front++;
							end++;
						}
					}
					front = 0;
					end = l-1;
				}
			} else { // 길이가 홀수인 경우
				for (int i = 0; i < pane.length; i++) {//가로 검사
					int mid = front + l/2;
					while(end < pane.length) {
						if(pane[i][front] == pane[i][end]) {// 팰린드롬 찾는중
							int f = front, e = end;
							while(f < mid && mid < e) {
								if(pane[i][++f] != pane[i][--e]) {
									break;
								}
							}
							if(e==mid-1) {
								count++;
							}
							front++;
							end++;
						} else {// 못찾음
							front++;
							end++;
						}
					}
					front = 0;
					end = l-1;
				}
				for (int i = 0; i < pane.length; i++) {//세로 검사
					int mid = front + l/2;
					while(end < pane.length) {
						if(pane[front][i] == pane[end][i]) {// 팰린드롬 찾는중
							int f = front, e = end;
							while(f < mid && mid < e) {
								if(pane[++f][i] != pane[--e][i]) {
									break;
								}
							}
							if(e==mid-1) {
								count++;
							}
							front++;
							end++;
						} else {// 못찾음
							front++;
							end++;
						}
					}
					front = 0;
					end = l-1;
				}
			}
			
			
			
			
			
			System.out.println("#"+testCase+" "+count);
		}
	
	
	}
}
