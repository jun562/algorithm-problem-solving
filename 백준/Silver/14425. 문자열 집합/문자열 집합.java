import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> s1 = new HashSet<>();
        String[] s2 = new String[M];

        for (int i = 0; i < N; i++) {
            s1.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            s2[i] = br.readLine();
        }

        int count = 0;

        for (String s : s2) {
            if (s1.contains(s)) {
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}
