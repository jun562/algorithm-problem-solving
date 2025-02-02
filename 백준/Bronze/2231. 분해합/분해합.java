import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    int num = 0;
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    int cons = 0;
    in.close();

    for (int i= 1; i<num; i++){
      String str = String.valueOf(i);
      int digit = 0;
      cons = 0;
      digit = String.valueOf(i).length();
      cons += i;
      
      for(int dig = digit; dig>0; dig--){
        cons += Character.getNumericValue(str.charAt(dig-1));
      }

      if(cons==num){
        System.out.println(i);
        return;
      } 
      else{
        continue;
      }
    }
    System.out.println(0);
  }
}