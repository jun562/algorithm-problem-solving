import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        scan.nextLine();
        char[][] B = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = scan.nextLine();
            for (int j = 0; j < M; j++) {
                B[i][j] = line.charAt(j);
            }
        }

        int min = 64;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                for (int k = i; k <= i + 7; k++) {
                    for (int l = j; l <= j + 7; l++) {
                        if ((k + l) % 2 == 0) {
                            if (B[k][l] != 'W') {
                                count++;
                            }
                        } else {
                            if (B[k][l] != 'B') {
                                count++;
                            }
                        }
                    }
                }
                int tempMin = Math.min(count, 64 - count);
                if (tempMin <= min) {
                    min = tempMin;
                }
            }
        }
        System.out.print(min);
    }
}
