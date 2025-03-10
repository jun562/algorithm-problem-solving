import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int [] input = new int[5];
    int homework = 0;
    for(int i=0; i<input.length; i++){
      input[i] = scan.nextInt();
    }
    while(input[1]>0 || input[2]>0){
      input[1] -= input[3];
      input[2] -= input[4];
      homework ++;
    }
    System.out.println(input[0]-homework);
    
  }
}
