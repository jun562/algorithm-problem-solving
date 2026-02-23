import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Set<String> result = new HashSet<>();

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                result.add(s.substring(j, j + i));
            }
        }

        bw.write(result.size() + "");
        bw.flush();
    }
}
