import java.util.*;

class Solution {
    static boolean[] visited;
    static String[] nums;
    static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        nums = numbers.split("");
        visited = new boolean[nums.length];
        for(int i = 1; i <= nums.length; i++){
            backtrack(i,0,"");
        }
        for(int s : set){
            if (s < 2){
                continue;
            }
            
            boolean isPrime = true;
            
            for(int i = 2; i * i <= s; i++){
                if(s % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                answer ++ ;
            }
        }
        
        return answer;
    }
    
    static void backtrack(int targetLength, int depth, String s){
        if(targetLength == depth){
            set.add(Integer.parseInt(s));
            return;
        }
        
        for(int i = 0; i<nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                backtrack(targetLength, depth + 1, s + nums[i]);
                visited[i] = false;
            }
        }
    }
}