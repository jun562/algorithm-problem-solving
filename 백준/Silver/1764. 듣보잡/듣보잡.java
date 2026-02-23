import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> result = new HashMap<>();
        List<String> names = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            result.put(name, 0);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (result.containsKey(name)) {
                names.add(name);
            }
        }

        Collections.sort(names);
        bw.write(names.size() + "\n");
        for (String name : names) {
            bw.write(name + "\n");
        }
        bw.flush();
    }
}
