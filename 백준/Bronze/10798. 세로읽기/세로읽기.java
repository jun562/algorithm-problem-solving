import java.util.*;

public class Main {
    public static void main(String[] args){
        String[][] words = new String[5][15];
        Scanner scan = new Scanner(System.in);
        String result = "";

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 15; j++){
                words[i][j] = "";
            }
        }

        for(int k = 0; k < 5; k++){
            String word = scan.nextLine();
            for(int l = 0; l < word.length(); l++){
                words[k][l] = String.valueOf(word.charAt(l));
            }
        }

        for(int m = 0; m < 15; m++){
            for (int n = 0; n < 5; n++){
                result += words[n][m];
            }
        }

        System.out.println(result);
    }
}
