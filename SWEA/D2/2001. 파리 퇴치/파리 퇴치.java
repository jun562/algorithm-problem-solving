import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] map = new int[N][N];
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < N; k++) {
					map[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = -1;
			for(int j = 0; j <= N - M; j++) {
				for(int s = 0; s <= N - M; s++) {
					int cur = 0;
					for(int k = j; k < j + M; k++) {
						for(int l = s; l < s + M; l++) {
							cur += map[k][l];
						}
					}
					max = Math.max(cur, max);
				}
				
			}
			
			bw.write(String.format("#%d %d\n", i+1, max));
		}
		
		bw.close();
		
	}
}
