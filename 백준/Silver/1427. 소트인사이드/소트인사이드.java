import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String i = br.readLine();
        String[] j = i.split("");

        Arrays.sort(j, Comparator.reverseOrder());

        for (int k = 0; k < j.length; k++) {
            bw.write(j[k]);
        }
        bw.flush();
    }
}
