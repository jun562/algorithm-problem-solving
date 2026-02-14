import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int base = scan.nextInt();
        List<Integer> numbers = new ArrayList<>();

        while(true){
            if (number < base) {
                break;
            }
            int N = number / base;
            int M = number % base;
            numbers.add(M);
            number = N;
        }
        numbers.add(number);

        for(int i = 0; i < numbers.size(); i++){
            int num = numbers.get(numbers.size()-i-1);
            if(num >= 0 && num <=9){
                System.out.printf("%c", num + '0');
                continue;
            }
            System.out.printf("%c", num + 'A' - 10);
        }
    }
}
