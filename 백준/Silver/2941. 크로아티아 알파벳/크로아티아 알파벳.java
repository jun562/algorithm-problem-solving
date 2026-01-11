import java.util.*;

public class Main{
    public static void main(String[] args) {
      List<String> alphabets = List.of("c=","c-","dz=","d-","lj","nj","s=","z=");
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine().trim();
      for (String alphabet : alphabets){
        input = input.replace(alphabet,"*");
      }
      System.out.println(input.length());
    }
}