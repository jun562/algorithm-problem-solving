import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);

            if (a[0] == 0 && a[1] == 0 && a[2] == 0) {
                break;
            }

            if (a[2] >= (a[0] + a[1])) {
                System.out.println("Invalid");
            } else if (a[0] == a[1] && a[1] == a[2]) {
                System.out.println("Equilateral");
            } else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }

}
