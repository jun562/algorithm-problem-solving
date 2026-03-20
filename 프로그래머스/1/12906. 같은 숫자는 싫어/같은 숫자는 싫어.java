import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new ArrayDeque<>();
    
        queue.offerLast(arr[0]);
        
        if (arr.length!=1){
            for(int i = 1; i<arr.length; i++){
                if(queue.peekLast() != arr[i]){
                    queue.offerLast(arr[i]);
                }
            }
        }
        
        int i = 0;
        int[] answer = new int[queue.size()];
        while(queue.peekLast()!=null){
            answer[i] = queue.pollFirst();
            i++;
        }

        return answer;
    }
}