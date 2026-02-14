import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int money = scan.nextInt();
            int[] coins = new int[4];

            if (money >= 25) {
                coins[0] = money / 25;
                money %= 25;
            }
            if (money >= 10) {
                coins[1] = money / 10;
                money %= 10;
            }
            if (money >= 5) {
                coins[2] = money / 5;
                money %= 5;
            }
            coins[3] = money;

            System.out.printf("%d %d %d %d", coins[0], coins[1], coins[2], coins[3]);
            System.out.println();
        }
    }
}
