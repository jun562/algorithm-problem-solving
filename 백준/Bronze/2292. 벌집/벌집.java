import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if (N == 1) {
            System.out.print(1);
            return;
        }

        N = N - 1;
        int count = 1;

        while (N > 0) {
            N -= 6 * count;
            count += 1;
        }
        System.out.print(count);
    }
}
