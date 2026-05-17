import java.util.*;

class Solution {
    static boolean[] visited;
    static int[][] d;
    static int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        d = dungeons;
        
        backtrack(k,0);
        return answer;
    }
    
    public static void backtrack(int k, int count){
        answer = Math.max(answer, count);
        
        for(int i = 0; i < visited.length; i++){
            if(!visited[i] && k >= d[i][0]){
                visited[i] = true;
                backtrack(k-d[i][1], count+1);
                visited[i] = false;
            }
        }
    }
}
//최소 필요 피로도 이상, 소모 피로도
//하루에 한번씩만 탐험 가능. 최대한 많이 탐험
//현재 피로도 k , 각 던전 별 [최소 필요 피로도,소모 피로도]
//던전 8개 이하
//최소 필요 피로도 >= 소모 피로도 (각 1천이하)