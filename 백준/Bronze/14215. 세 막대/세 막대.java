import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);

        while (true) {
            if (a[2] >= a[0] + a[1]) {
                a[2] -= 1;
                continue;
            }
            System.out.print(a[0] + a[1] + a[2]);
            break;
        }
    }
}
