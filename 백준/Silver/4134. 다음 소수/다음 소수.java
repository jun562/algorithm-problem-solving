import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(br.readLine());

            if (n == 0 || n == 1) {
                bw.write(2 + "\n");
                continue;
            }

            while (true) {
                boolean b = true;
                for (long j = 2; j * j <= n; j++) {
                    if (n % j == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    break;
                }
                n++;
            }
            bw.write(n + "\n");
        }
        bw.flush();
    }
}
