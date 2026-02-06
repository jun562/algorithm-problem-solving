import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true) {
            int first = scan.nextInt();
            int second = scan.nextInt();

            if(first == 0 && second == 0) {
                break;
            }

            if(second % first == 0) {
                System.out.println("factor");
                continue;
            }

            if(first % second == 0) {
                System.out.println("multiple");
                continue;
            }

            System.out.println("neither");
        }
    }
}
