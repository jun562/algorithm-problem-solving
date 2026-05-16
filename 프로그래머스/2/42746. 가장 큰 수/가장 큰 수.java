import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] result = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            result[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(result, (a,b) -> {return (b+a).compareTo((a+b)) ;});
        for(int i = 0; i < result.length; i++){
            answer += result[i];
        }
        
        boolean flag = true; // 0인 플래그
        for(int i = 0; i< result.length; i++){
            if(!result[i].equals("0")){ //자료형 잘보기
                flag = false;
                break;
            }
        }
        
        if(flag){
            answer="0";
        }
        
        return answer;
    }
}

//제일 앞 높은 숫자가 먼저,
//제일 앞 숫자가 같은 경우