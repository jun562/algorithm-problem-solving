import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] N = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            N[i] = scan.nextInt();
            sum += N[i];
        }

        Arrays.sort(N);

        System.out.println(sum/5);
        System.out.println(N[2]);
    }
}
