import java.util.*;

class Solution {
    public int solution(String arr[]) {
        int n = arr.length / 2 + 1;
        
        int[][] max_dp = new int[n][n];
        int[][] min_dp = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(max_dp[i], Integer.MIN_VALUE);
            Arrays.fill(min_dp[i], Integer.MAX_VALUE);
            
            //초기값
            int num = Integer.parseInt(arr[i * 2]);
            max_dp[i][i] = num;
            min_dp[i][i] = num;
        }
        
        for (int step = 1; step < n; step++) {
            
            // i: 시작점
            for (int i = 0; i < n - step; i++) {
                // j: 끝점
                int j = i + step;
                // k: 시작점과 끝점 사이를 가를 중간점 (어디서 괄호를 닫을지 결정)
                for (int k = i; k < j; k++) {
                    String op = arr[k * 2 + 1];
                    
                    if (op.equals("+")) {
                        max_dp[i][j] = Math.max(max_dp[i][j], max_dp[i][k] + max_dp[k + 1][j]);
                        min_dp[i][j] = Math.min(min_dp[i][j], min_dp[i][k] + min_dp[k + 1][j]);
                    } else if (op.equals("-")) {
                        // 최댓값 = (앞의 가장 큰 값) - (뒤의 가장 작은 값)
                        max_dp[i][j] = Math.max(max_dp[i][j], max_dp[i][k] - min_dp[k + 1][j]);
                        // 최솟값 = (앞의 가장 작은 값) - (뒤의 가장 큰 값)
                        min_dp[i][j] = Math.min(min_dp[i][j], min_dp[i][k] - max_dp[k + 1][j]);
                    }
                }
            }
        }
        return max_dp[0][n - 1];
    }
}