import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> a = new HashMap<>();
        String name = "";
        for(String s : participant) {
            a.put(s,a.getOrDefault(s,0) + 1);
        }
        for(String s : completion) {
            if(a.containsKey(s)){
                a.put(s,a.get(s) - 1);
            } else {
                name = s;
            }
        }
        for(String s : a.keySet()){
            if (a.get(s) != 0){
                name = s;
            }
        }
        return name;
    }
}