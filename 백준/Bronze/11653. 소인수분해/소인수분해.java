import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // 1. i * i <= N 까지만 반복 (루트 N 최적화)
        for (int i = 2; i * i <= N; i++) {
            // i로 나누어 떨어지는 동안 계속 나눔 (소인수분해)
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        // 2. 반복문 종료 후 N이 1보다 크다면, 
        // 그 남은 수는 소수이므로 출력해야 함
        if (N > 1) {
            System.out.println(N);
        }
    }
}