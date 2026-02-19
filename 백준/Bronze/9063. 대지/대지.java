import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] x = new int[count];
        int[] y = new int[count];
        int h = 0;
        int l = 0;

        for (int i = 0; i < count; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        l = x[count - 1] - x[0];
        h = y[count - 1] - y[0];

        System.out.print(l * h);

    }
}
