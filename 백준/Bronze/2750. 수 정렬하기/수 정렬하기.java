import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] N = new int[count];

        for (int i = 0; i < count; i++) {
            N[i] = scan.nextInt();
        }

        Arrays.sort(N);

        for (int i = 0; i < count; i++) {
            System.out.println(N[i]);
        }
    }
}
