import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n];
        
        dp[0][0] = triangle[0][0];
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j==0){
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                }
                else if(j==i){
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                } else{
                    dp[i][j] = Math.max(dp[i-1][j]+triangle[i][j],dp[i-1][j-1] + triangle[i][j]);
                }
            }
        }
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(answer < dp[n-1][i]){
                answer = dp[n-1][i];
            }
        }
        return answer;
    }
}

// DFS로 접근 : 2 ^ 499 -> 불가능
// DFS가 아니면, DP? : 
// dp[i][j] = 꼭대기부터 시작해서 (i,j) 칸에 도달했을때, 거쳐온 숫자들의 최대 합
// dp[0][0] = triangle[0][0]
// dp[i-1][j-1] + triangle[i][j]  VS dp[i-1][j] + triangle[i][j]