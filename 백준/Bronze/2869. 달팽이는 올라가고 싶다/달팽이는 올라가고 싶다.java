import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]); //낮+
        int B = Integer.parseInt(input[1]); //밤-
        int V = Integer.parseInt(input[2]); //높이

        int day = (V - A) / (A - B) + 1;
        int rest = (V - A) % (A - B);

        if (rest != 0) {
            day += 1;
        }

        System.out.print(day);
    }
}
