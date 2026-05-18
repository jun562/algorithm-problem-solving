import java.util.*;

class Solution {
    static String[] alphabets = {"A","E","I","O","U"};
    static List<String> dict = new ArrayList<>();
    public int solution(String word) {
        int answer = 0;
        backtrack("");
        answer = dict.indexOf(word) + 1;
        return answer;
    }
    
    public static void backtrack(String s){
        if(!s.equals("")){
            dict.add(s);
        }
        
        if(s.length() == 5){
            return;
        }
        
        for(int i = 0; i<alphabets.length; i++){
            backtrack(s + alphabets[i]);
        }
    }
}