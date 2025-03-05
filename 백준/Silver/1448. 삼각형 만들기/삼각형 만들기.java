import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 가장 긴 변의 길이가 나머지 두변의 합보다 작아야 성립

public class Main {
  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine()); 
    int sum = -1;
    int[] lengthStore = new int[count];

    for(int i =0; i<count; i++){
      lengthStore[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(lengthStore);

    while(count>=3){ //ArrayIndexOutofBounds 처리
      if(lengthStore[count-1]<lengthStore[count-2]+lengthStore[count-3]){ 
        sum = lengthStore[count-1] + lengthStore[count-2]+lengthStore[count-3];
        break;
      }
      count --;
    }
    System.out.println(sum);
  }
}
