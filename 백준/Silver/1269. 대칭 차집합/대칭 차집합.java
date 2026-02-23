import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        int aSize = aSet.size();
        int bSize = bSet.size();
        int duplicated = 0;
        Iterator<Integer> it = aSet.iterator();
        while (it.hasNext()) {
            if (bSet.contains(it.next())) {
                duplicated += 1;
            }
        }
        
        bw.write(aSize + bSize - 2 * duplicated + "");
        bw.flush();
    }
}
