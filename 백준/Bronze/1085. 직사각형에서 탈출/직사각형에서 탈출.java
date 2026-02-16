import java.util.*;

public class Main {
    public static void main(String[] args) {
        // (0,0) (0,h) (w,0) (w,h)
        // x,y는 직사각형 내부
        // x,y,w,h는 정수

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int[] d = {x, y, w - x, h - y};
        Arrays.sort(d);

        System.out.print(d[0]);
    }
}
