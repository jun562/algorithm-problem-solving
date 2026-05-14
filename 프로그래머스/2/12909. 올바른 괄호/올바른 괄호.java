import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> dq = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                dq.push(c);
            } else {
                if (dq.peek()!=null && dq.peek()=='('){
                    dq.pop();
                } else {
                    answer = false;
                }
            }
        }
        
        if(dq.size() != 0){
            answer = false;
        }

        return answer;
    }
}