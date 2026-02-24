import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            if (i == 1) {
                continue;
            }
            boolean a = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}
