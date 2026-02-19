import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a + b + c) == 180) {
            if ((a == b) && (b == c)) {
                System.out.print("Equilateral");
                return;
            }
            if ((a == b) || (b == c) || (a == c)) {
                System.out.print("Isosceles");
                return;
            }
            System.out.print("Scalene");
        } else {
            System.out.print("Error");
        }
    }
}
