import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] f = new int[2];
        f[0] = scan.nextInt();
        f[1] = scan.nextInt();

        int c = scan.nextInt();
        int n = scan.nextInt();

        if ((f[0] * n + f[1] <= c * n) && (f[0] <= c)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
