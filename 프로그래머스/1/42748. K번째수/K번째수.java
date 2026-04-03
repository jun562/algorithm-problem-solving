import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int order = commands[i][2];
            int[] temp = new int[end-start+1];
            int k = 0;
            for (int j = start-1; j <= end-1; j++,k++){
                temp[k] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[order-1];
        }
        return answer;
    }
}