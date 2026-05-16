import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int n = 0; n < commands.length; n++){
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            int[] slice = new int[j-i+1];
            int order = 0;
            for(int l = i - 1; l < j; l++ ){
                slice[order] = array[l];
                order++;
            }
            Arrays.sort(slice);
            answer[n] = slice[k-1];
        }
        
        return answer;
    }
}