import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int result = 0;

        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();
            boolean found = true;

            if (num == 1) {
                continue;
            }

            if (num == 2) {
                result += 1;
                continue;
            }

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    found = false;
                    break;
                }
            }

            if (found) {
                result += 1;
            }

        }

        System.out.print(result);
    }
}
