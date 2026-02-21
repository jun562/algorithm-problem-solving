import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt();
        Integer[] s = new Integer[N];

        for (int i = 0; i < N; i++) {
            s[i] = scan.nextInt();
        }

        Arrays.sort(s, Comparator.reverseOrder());

        System.out.print(s[k - 1]);
    }
}
