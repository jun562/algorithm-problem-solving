import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    int num1 = 0;
    int num2 = 1;
    int temp = 0;
    int order = 0;
    Scanner scan = new Scanner(System.in);
    order = scan.nextInt() + 1;
    for(int i = 3; i<=order; i++){
      temp = num2;
      num2 = num1 + num2;
      num1 = temp;
    }
    System.out.println(num2);
    scan.close();
  }
}