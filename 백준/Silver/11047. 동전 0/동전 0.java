import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args){
    int count = 0;
    Scanner scan = new Scanner(System.in);
    String[] arr = scan.nextLine().split(" ");
    int[] intArr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
    int[] coins = new int[intArr[0]];
    int money = intArr[1];
    for(int i = 0; i<intArr[0]; i++){
      coins[i] = scan.nextInt();
    }
    int index = intArr[0] - 1;
    int coin = coins[index];
    
    while(money != 0){
      if( (money-coin) < 0){
        index--;
        coin = coins[index];
        continue;
      }
      money = money - coin;
      count ++;
    }
    System.out.println(count);
    scan.close();
  }
}
