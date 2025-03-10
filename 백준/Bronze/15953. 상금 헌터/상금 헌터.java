import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int repeat = scan.nextInt();
    scan.nextLine(); //남아있는 개행문자 "\n"을 제거하기 위한 nextLine 메서드 호출
    int[] firstPrize = {5000000, 3000000, 2000000, 500000, 300000, 100000};
    int[] secondPrize = {5120000, 2560000, 1280000, 640000, 320000};

    for(int i = 0; i<repeat; i++){
      String[] rank = scan.nextLine().split(" ");
      int first = Integer.parseInt(rank[0]);
      int second = Integer.parseInt(rank[1]);
      int totalPrize = 0;
      
      for(int j = 1; first > 0 && j<=firstPrize.length; j++){
        if(first>21) break;
        first -= j;
        if(first<= 0){
          totalPrize += firstPrize[j-1];
          break;
        }
      }
      for(int j = 1; second > 0 && j<=secondPrize.length; j++){
        if(second>32) break;
        second -=(int)Math.pow(2, j-1); //pow 메소드의 반환 값은 Double 이므로 int 형으로 강제 형변환
        if(second<=0){
          totalPrize += secondPrize[j-1];
        }
      }
      System.out.println(totalPrize);
    }
    scan.close();
  }
}
