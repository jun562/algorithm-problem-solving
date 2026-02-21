import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int order = 0;
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            if (order == count) {
                System.out.print(i - 1);
                break;
            }

            if (String.valueOf(i).contains("666")) {
                order += 1;
            }
        }
    }
}
