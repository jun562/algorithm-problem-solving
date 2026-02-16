import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;
        List<Integer> nums = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            boolean found = true;

            if (i == 1) {
                continue;
            }

            if (i == 2) {
                nums.add(i);
                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    found = false;
                    break;
                }
            }

            if (found) {
                nums.add(i);
            }
        }

        if (nums.isEmpty()) {
            System.out.print(-1);
            return;
        }

        for (int num : nums) {
            sum += num;
        }

        System.out.println(sum);
        System.out.println(nums.get(0));

    }
}