import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            List<Integer> nums = new ArrayList<>();
            int sum = 0;

            if (n == -1) {
                break;
            }

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    nums.add(i);
                }
            }

            for (int num : nums) {
                sum += num;
            }

            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
                continue;
            }

            System.out.print(n + " = 1");
            
            for (int i = 1; i < nums.size(); i++) {
                System.out.print(" + " + nums.get(i));
            }

            System.out.println();
        }
    }
}
