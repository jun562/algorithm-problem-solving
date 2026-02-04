import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        List<String> words = new ArrayList<>();
        int result = 0;

        for(int order = 0; order < count; order ++){
            words.add(scan.nextLine());
        }

        for(int verifiedOrder = 0; verifiedOrder < count; verifiedOrder ++){
            String word = words.get(verifiedOrder);
            String previousAlphabet = "";
            boolean isGroupedWord = true;
            List<String> previousAlphabets = new ArrayList<>();

            for(int index = 0; index < word.length(); index ++){
                String alphabet = String.valueOf(word.charAt(index));

                if (alphabet.equals(previousAlphabet)){
                    continue;
                }

                if (previousAlphabets.contains(alphabet)){
                    isGroupedWord = false;
                    break;
                }

                previousAlphabets.add(alphabet);
                previousAlphabet = alphabet;
            }

            if (isGroupedWord)
                result ++;
        }

        System.out.print(result);
    }
}
