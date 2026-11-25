import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] p = new int[N];
		Deque<Integer> dq = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		int num = 1;
		
		for(int i = 0; i < N; i++) {
			dq.push(p[i]);
			while( !dq.isEmpty() && dq.peek() == num) {
					dq.pop();
					num ++;
			}
		}
		
		if(dq.isEmpty()) {
			bw.write("Nice");
		} else {
			bw.write("Sad");
		}
		
		bw.close();
	}
	
}
