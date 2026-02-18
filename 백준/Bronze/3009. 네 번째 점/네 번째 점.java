import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            a.add(scan.nextInt());
            b.add(scan.nextInt());
        }

        Collections.sort(a);
        Collections.sort(b);

        if (a.get(0).equals(a.get(1))) {
            x = a.get(2);
        } else {
            x = a.get(0);
        }

        if (b.get(0).equals(b.get(1))) {
            y = b.get(2);
        } else {
            y = b.get(0);
        }

        System.out.printf("%d %d", x, y);
    }
}
