import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                boolean a = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        a = false;
                        break;
                    }
                }
                if (a) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}
