import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] nums = new int[3];
    int[] countNum = new int[10]; 
    String result = "";
    for(int i =0; i<nums.length; i++){
      nums[i] = scan.nextInt();
    }
    result = Integer.toString(nums[0]*nums[1]*nums[2]);
    for(int i=0; i<countNum.length; i++){
      for(int j=0; j<result.length();j++){
        if(result.charAt(j) == Character.forDigit(i,10)){
          countNum[i]++;
        }
      }
      System.out.println(countNum[i]);
    }
    
    scan.close();
  }
}