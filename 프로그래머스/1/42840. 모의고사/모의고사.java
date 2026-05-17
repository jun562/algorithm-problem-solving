import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] fa = {1,2,3,4,5}; 
        int[] sa = {2,1,2,3,2,4,2,5};
        int[] ta = {3,3,1,1,2,2,4,4,5,5};
        int fc = 0;
        int sc = 0;
        int tc = 0;
        int maxScore = 0;
        for (int i = 0; i< answers.length; i++){
            if(fa[i%5] == answers[i]){
                fc++;
            }
            if(sa[i%8] == answers[i]){
                sc++;
            }
            if(ta[i%10] == answers[i]){
                tc++;
            }
        }
        maxScore = Math.max(fc,Math.max(sc,tc));
        List<Integer> result = new ArrayList<>();
        
        if(fc == maxScore){
            result.add(1);
        } 
        if(sc == maxScore){
            result.add(2);
        }
        if(tc == maxScore){
            result.add(3);
        }
        
        answer = new int[result.size()];
        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}

//1번 -> 1,2,3,4,5
//2번 -> 2,1,2,3,2,4,2,5
//3번 -> 3,3,1,1,2,2,4,4,5,5