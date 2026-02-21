import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] s = new Integer[N];

        for (int i = 0; i < N; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(s);

        for (int i = 0; i < N; i++) {
            bw.write(s[i] + "\n");
        }
        bw.flush();
    }
}
