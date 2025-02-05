import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args){
    int[] asc = {1,2,3,4,5,6,7,8};
    int[] desc = {8,7,6,5,4,3,2,1};
    Scanner scan = new Scanner(System.in);
    int[] answer  = new int[asc.length];
    String[] temp = scan.nextLine().split(" ");
    for(int i =0; i<temp.length; i++){
      answer[i] = Integer.parseInt(temp[i]);
    }
    
    if(Arrays.equals(answer, asc)){
      System.out.println("ascending");
    }
    else if(Arrays.equals(answer, desc)){
      System.out.println("descending");
    }
    else{
      System.out.println("mixed");
    }

  }
}
