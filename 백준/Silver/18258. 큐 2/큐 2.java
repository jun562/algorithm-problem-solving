import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> q = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                q.offerLast(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop")) {
                Integer n = q.pollFirst();
                if (n == null) {
                    bw.write("-1\n");
                } else {
                    bw.write(n + "\n");
                }
            } else if (s.equals("size")) {
                bw.write(q.size() + "\n");
            } else if (s.equals("empty")) {
                if (q.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (s.equals("front")) {
                Integer n = q.peekFirst();
                if (n == null) {
                    bw.write("-1\n");
                } else {
                    bw.write(n + "\n");
                }
            } else if (s.equals("back")) {
                Integer n = q.peekLast();
                if (n == null) {
                    bw.write("-1\n");
                } else {
                    bw.write(n + "\n");
                }
            }
        }
        bw.flush();
    }
}
