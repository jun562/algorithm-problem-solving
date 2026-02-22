import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] numbers2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            numbers2[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> match = new HashMap<>();
        for (int n : numbers2) {
            match.put(n, 0);
        }

        for (int n : numbers) {
            if (match.containsKey(n)) {
                match.put(n, 1);
            }
        }

        for (int n : numbers2) {
            bw.write(match.get(n) + "\n");
        }
        bw.flush();
    }
}
