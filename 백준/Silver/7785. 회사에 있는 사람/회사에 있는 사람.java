import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<String, String> entry = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            entry.put(st.nextToken(), st.nextToken());
        }

        List<String> names = new ArrayList<>();

        for (String name : entry.keySet()) {
            if (entry.get(name).equals("enter")) {
                names.add(name);
            }
        }

        Collections.sort(names, Comparator.reverseOrder());

        for (String name : names) {
            bw.write(name + "\n");
        }
        bw.flush();
    }
}
