import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        for(String n : phone_book){
            set.add(n);
        }
        for(String s : set){
            for (int i = 1; i < s.length(); i++){ //자기 자신 포함 X
                String temp = s.substring(0,i);
                if(set.contains(temp)){
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}