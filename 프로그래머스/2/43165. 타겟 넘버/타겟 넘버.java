import java.util.*;

class Solution {
    
    static int N,S;
    static int[] K;
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        N = numbers.length;
        S = target;
        K = numbers;
        backtrack(0,0);
        return answer;
    }
    
    public static void backtrack(int depth, int sum) {
        if (depth == N){
            if (sum == S){
                answer++;
            }
            return;
        }
        
        backtrack(depth+1, sum + K[depth]);
        
        backtrack(depth+1, sum - K[depth]);
    }
}

//정수(0포함), 순서를 바꾸지 않고 등호 추가 (+,-) -> 타켓 넘버 달성