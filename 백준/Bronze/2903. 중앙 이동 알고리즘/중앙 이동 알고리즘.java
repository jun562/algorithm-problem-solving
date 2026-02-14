import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int line = 2;
        for (int i = 0; i < count; i++) {
            line = 2 * line - 1;
        }
        System.out.println(line * line);
    }
}