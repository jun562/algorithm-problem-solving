class Solution {
    public int solution(int m, int n, int[][] puddles) {
        
        int[][] dp = new int[m + 1][n + 1];
        
        for (int[] puddle : puddles) {
            int x = puddle[0]; 
            int y = puddle[1]; 
            dp[x][y] = -1;    
        }
        
        dp[1][1] = 1;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (i == 1 && j == 1) continue;
                
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;     
                }
                
                // 점화식: (현재 칸으로 오는 경우의 수) = (위쪽에서 오는 수) + (왼쪽에서 오는 수)
                int fromTop = dp[i][j-1];
                int fromLeft = dp[i-1][j];
                
                dp[i][j] = (fromTop + fromLeft) % 1000000007;
            }
        }
        
        return dp[m][n];
    }
}