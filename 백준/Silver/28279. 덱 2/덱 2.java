import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			if(t == 1) {
				int x = Integer.parseInt(st.nextToken());
				dq.offerFirst(x);
			} else if (t == 2) {
				int x = Integer.parseInt(st.nextToken());
				dq.offerLast(x);
			} else if (t == 3) {
				if(!dq.isEmpty()) {
					bw.write(dq.pollFirst() + "\n");
				} else {
					bw.write("-1\n");
				}
			} else if (t == 4) {
				if(!dq.isEmpty()) {
					bw.write(dq.pollLast() + "\n");
				} else {
					bw.write("-1\n");
				}
			} else if (t == 5) {
				bw.write(dq.size()+"\n");
			} else if (t == 6) {
				if(dq.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if (t == 7) {
				if(!dq.isEmpty()) {
					bw.write(dq.peekFirst() + "\n");
				} else {
					bw.write("-1\n");
				}
			} else {
				if(!dq.isEmpty()) {
					bw.write(dq.peekLast() + "\n");
				} else {
					bw.write("-1\n");
				}
			}
			
		}
		bw.close();
	}
}
