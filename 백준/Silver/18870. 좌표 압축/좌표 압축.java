import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        int[] tp = p.clone();
        Arrays.sort(tp);

        int rank = 0;
        Map<Integer, Integer> r = new HashMap<>();
        for (int n : tp) {
            if (!r.containsKey(n)) {
                r.put(n, rank);
                rank++;
            }
        }

        for (int n : p) {
            bw.write(r.get(n) + " ");
        }

        bw.flush();
    }
}
