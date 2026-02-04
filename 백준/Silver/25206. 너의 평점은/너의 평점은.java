import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> scoreAlphabet = List.of("A+","A0","B+","B0","C+","C0","D+","D0","F");
        List<Double> grades = List.of(4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0);
        Map<String,Double> scoreMap = new HashMap<>();

        double totalScore = 0.0;
        double totalCredit = 0.0;
        int index = 0;

        for(String alphabet : scoreAlphabet){
            scoreMap.put(alphabet,grades.get(index));
            index ++;
        }

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            String input = scan.nextLine();
            List<String> splittedInput = List.of(input.split(" "));

            if(splittedInput.get(2).equals("P")){
                continue;
            }

            double credit = Double.parseDouble(splittedInput.get(1));
            double grade = scoreMap.get(splittedInput.get(2));

            totalScore += (credit * grade);
            totalCredit += credit;
        }

        System.out.printf("%.6f",totalScore / totalCredit);
    }
}
