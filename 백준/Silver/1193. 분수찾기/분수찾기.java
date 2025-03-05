import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int seq = scan.nextInt();
    int order = 1;
    while(true){
      seq -= order;
      if(seq<=0){
        seq += order;
        break;
      }
      order ++;
    }
    if(order % 2 == 0){
      System.out.println(seq +"/"+(order+1-seq));
    } else{
      System.out.println((order+1-seq)+ "/"+ seq);
    }
    scan.close();
  }
}