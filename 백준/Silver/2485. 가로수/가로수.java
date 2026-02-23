import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] c = new int[N];
        int[] d = new int[N - 1];

        for (int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N - 1; i++) {
            d[i] = c[i + 1] - c[i];
        }
        int gcd = d[0];
        for (int i = 1; i < N - 1; i++) {
            gcd = getGCD(gcd, d[i]);
        }

        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += (d[i] / gcd - 1);
        }

        bw.write(sum + "");
        bw.flush();
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
