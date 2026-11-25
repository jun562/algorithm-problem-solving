import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++) {
			q.offer(i+1);
		}

		bw.write("<");
		
		if(q.size() == 1) {
			bw.write(q.peek() + ">");
			bw.close();
			return;
		}
		
		while(q.size() != 1){
			for(int i = 0; i < K-1; i++) {
				int t = q.poll();
				q.offer(t);
			}
			
			bw.write(q.poll() + ", ");
		}
		
		bw.write(q.peek() + ">");
		
		bw.close();
	}
}
