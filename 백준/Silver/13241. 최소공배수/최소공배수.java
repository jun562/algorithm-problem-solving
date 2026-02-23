import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Integer.parseInt(st.nextToken());
        long num2 = Integer.parseInt(st.nextToken());
        long tempN1 = num1;
        long tempN2 = num2;

        while (tempN2 != 0) {
            long tmp = tempN1 % tempN2;
            tempN1 = tempN2;
            tempN2 = tmp;
        }
        bw.write(num1 * num2 / tempN1 + "");

        bw.flush();
    }
}
