import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int num3 = Integer.parseInt(st.nextToken());
        int num4 = Integer.parseInt(st.nextToken());

        int tempN1 = num2;
        int tempN2 = num4;

        while (tempN2 != 0) {
            int tmp = tempN1 % tempN2;
            tempN1 = tempN2;
            tempN2 = tmp;
        }

        int parent = num2 * num4 / tempN1;
        int child = (parent / num2) * num1 + (parent / num4) * num3;

        int tempN3 = child;
        int tempN4 = parent;

        while (tempN4 != 0) {
            int tmp = tempN3 % tempN4;
            tempN3 = tempN4;
            tempN4 = tmp;
        }

        bw.write(child / tempN3 + " " + parent / tempN3);
        bw.flush();
    }
}
