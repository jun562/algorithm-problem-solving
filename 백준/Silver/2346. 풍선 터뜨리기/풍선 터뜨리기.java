import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i = 1; i <= N; i++) {
			dq.offerLast(i);
		}
		
		int n = dq.pollFirst();
		bw.write(n + " ");
		
		while(!dq.isEmpty()) {
			if(nums[n] > 0) {
				for(int i = 0; i < nums[n] - 1; i ++) {
					dq.offerLast(dq.pollFirst());
				}
				n = dq.pollFirst();
				bw.write(n + " ");
			} else {
				for(int i = 0; i < Math.abs(nums[n]) - 1; i ++) {
					dq.offerFirst(dq.pollLast());
				}
				n = dq.pollLast();
				bw.write(n + " ");
			}
			
		}
		
		bw.close();
	}
}
