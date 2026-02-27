import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Integer.parseInt(br.readLine());
        bw.write(factorial(N) + "");
        bw.flush();
    }

    public static long factorial(long N) {
        if (N <= 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
