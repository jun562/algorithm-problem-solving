import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] win = new boolean[n+1][n+1];
        
        for(int[] r : results){
            win[r[0]][r[1]] = true;
        }
        
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=n; j++){
                for(int k = 1; k <=n; k++){
                    if(win[j][i] && win[i][k]){
                        win[j][k] = true;
                    }
                }
            }
        }
        int answer = 0;
        
        for(int i= 1 ; i<=n; i++){
            int count = 0;
            for(int j = 1; j<=n; j++){
                if (i == j){
                    continue;
                }
                if(win[i][j] || win[j][i]){
                    count++;
                }
            }
            if(count == n-1){
                answer++;
            }
        }
        return answer;
    }
}

//n 명 권투 선수
//1:1 방식
//실력순 
//결과를 통한 순위
//몇 경기를 분실
//선수 : n명 , 경기 결과 : results
//정확하게 순위를 매길 수 있는 선수의 수