import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Point[] p = new Point[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            p[i] = new Point(x, y);
        }

        Arrays.sort(p, (p1, p2) -> {
            if (p1.x != p2.x) {
                return p1.x - p2.x;
            }
            return p1.y - p2.y;
        });

        for (int i = 0; i < count; i++) {
            bw.write(p[i].x + " " + p[i].y + "\n");
        }
        bw.flush();
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
