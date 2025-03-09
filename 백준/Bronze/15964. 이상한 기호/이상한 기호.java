import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String [] nums = scan.nextLine().split(" ");
    long num1 = Integer.parseInt(nums[0]);
    long num2 = Integer.parseInt(nums[1]);
    long result = (num1+num2) * (num1-num2);
    System.out.println(result);
  }
}
