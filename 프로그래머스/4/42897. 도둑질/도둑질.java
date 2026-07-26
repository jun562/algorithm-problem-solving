import java.util.*;

class Solution {
    public int solution(int[] money) {
        int n = money.length;
        int[] dpFirst = new int[n];
        int[] dpSecond = new int[n];
        
        dpFirst[0] = money[0];
        dpFirst[1] = Math.max(money[0],money[1]);
        
        dpSecond[0] = 0;
        dpSecond[1] = money[1];
        
        for (int i = 2; i < n - 1; i++) {
            dpFirst[i] = Math.max(dpFirst[i-1], dpFirst[i-2] + money[i]);
        }
        
        for (int i = 2; i < n; i++) {
            dpSecond[i] = Math.max(dpSecond[i-1], dpSecond[i-2] + money[i]);
        }
        
        return Math.max(dpFirst[n-2], dpSecond[n-1]);
    }
}