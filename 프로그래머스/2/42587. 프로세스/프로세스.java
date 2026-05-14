import java.util.*;

class Process {
    int prior;
    int location;
    Process(int prior, int location){
        this.prior = prior;
        this.location = location;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Process> q = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < priorities.length; i++){
            q.offer(new Process(priorities[i],i));
            pq.offer(priorities[i]);
        }
        
        while(!q.isEmpty()){
            Process p = q.poll();
            
            if(p.prior == pq.peek()){
                pq.poll();
                answer++;
                
                if (p.location == location){
                    return answer;
                }
            } else {
                q.offer(p);
            }
        }
        
        return answer;
    }
}