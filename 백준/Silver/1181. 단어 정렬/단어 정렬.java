import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Set<String> s = new HashSet<>();

        for (int i = 0; i < count; i++) {
            s.add(br.readLine());
        }

        List<String> a = new ArrayList<>(s);

        Collections.sort(a, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        });

        for (String i : a) {
            bw.write(i + "\n");
        }
        bw.flush();
    }
}
