import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] N = new int[6];
        for (int i = 0; i < 6; i++) {
            N[i] = scan.nextInt();
        }

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((N[0] * i + N[1] * j == N[2]) && (N[3] * i + N[4] * j == N[5])) {
                    System.out.printf("%d %d", i, j);
                }
            }
        }
    }
}
