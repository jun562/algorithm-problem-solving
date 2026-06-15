import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Deque<Character> dq = new ArrayDeque<>();
        String answer = "";
        for(int i = 0; i< number.length(); i++){
            char current = number.charAt(i);
            while(!dq.isEmpty() && k > 0 && dq.peek() < current){
                dq.pop();
                k--;
            }
            dq.push(current);
        }
        
        while(k > 0){
            dq.pop();
            k--;
        }
        
        while(!dq.isEmpty()){
            answer += dq.pollLast();
        }
        return answer;
    }
}