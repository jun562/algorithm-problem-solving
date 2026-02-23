import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int tempN1 = num1;
            int tempN2 = num2;

            while (tempN2 != 0) {
                int tmp = tempN1 % tempN2;
                tempN1 = tempN2;
                tempN2 = tmp;
            }
            bw.write(num1 * num2 / tempN1 + "\n");
        }
        bw.flush();
    }
}
