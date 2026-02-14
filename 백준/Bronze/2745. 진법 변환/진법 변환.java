import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<Character,Integer> numbers = new HashMap<>();
        char a = 'A';
        for (int i = 0; i < 26; i++){
            numbers.put((char)(a+i),10+i);
        }

        Scanner scan = new Scanner(System.in);
        String[] number = scan.next().split("");
        int length = number.length;
        int base = scan.nextInt();
        int sum = 0;

        for(int i = 0; i < length; i++){
            String num = number[length-i-1];

            if (num.matches("^[A-Z]$")) {
                sum += numbers.get(num.charAt(0)) * (int)Math.pow(base,i);
                continue;
            }
            sum += Integer.parseInt(num) * (int)Math.pow(base,i);
        }

        System.out.println(sum);
    }
}
