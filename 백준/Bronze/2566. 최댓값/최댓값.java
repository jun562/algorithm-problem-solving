import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = 0;
        int column = 0;
        int maxNumber = -1;
        int[][] board = new int[9][9];

        for (int i = 0; i < 9; i++){
            String[] numbers = scan.nextLine().split(" ");
            for (int j = 0; j < 9; j++){
                board[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        for (int k = 0; k < 9; k++) {
            for (int l = 0; l < 9; l++){
                if (board[k][l] > maxNumber){
                    maxNumber = board[k][l];
                    row = k + 1;
                    column = l + 1;
                }
            }
        }

        System.out.println(maxNumber);
        System.out.printf("%d %d",row,column);
    }
}
