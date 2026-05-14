import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            m.put(clothes[i][1],m.getOrDefault(clothes[i][1],0) + 1);
        }
        
        int temp = 1;
        for(String s : m.keySet()){
            temp = temp * (m.get(s)+1);
        }
        answer = temp - 1;
        return answer;
    }
}