import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i = 0; i < N; i ++) {
			dq.offerLast(i+1);
		}
		
		while(true) {
			if(dq.size() == 1) {
				bw.write(dq.peek()+"");
				break;
			}
			dq.pollFirst();
			
			int top = dq.peekFirst();
			dq.pollFirst();
			dq.offerLast(top);
			
		}
		
		bw.close();
	}
} 
