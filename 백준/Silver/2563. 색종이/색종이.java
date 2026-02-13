import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[][] a = new int[100][100];
        int sum = 0;

        for(int i = 0; i < count; i++){
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++){
                    if (a[j][k] == 0){
                      a[j][k] = 1;
                    }
                }
            }
        }
        
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if (a[i][j] == 1){
                    sum += 1;
                }
            }
        }
        
        System.out.println(sum);
    }
}