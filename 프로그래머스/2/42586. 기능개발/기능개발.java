import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] time = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            int m = ((100-progresses[i]) / speeds[i]);
            int r = ((100-progresses[i]) % speeds[i]);
            if(r!=0){
                time[i] = m + 1;
            } else {
                time[i] = m;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int t : time){
            q.offer(t);
        }
        
        List<Integer> result = new ArrayList<>();
        int[] answer;
        
        while(!q.isEmpty()){
            int count = 0;
            int current = q.poll();
            count ++;
            while(q.peek()!=null && q.peek() <= current){
                q.poll();
                count++;
            }
            result.add(count);
        }
        
        answer = new int[result.size()];
        
        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}