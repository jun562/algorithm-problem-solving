import java.util.*;

class Work {
    int start;
    int end;
    int time;
    int num; 
    Work(int start, int time, int num){
        this.start = start;
        this.time = time;
        this.num = num;
        this.end = 0;
    }
}

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Work> pq = new PriorityQueue<>((a,b) -> {
            if(a.time != b.time){
                return a.time - b.time;
            }
            if(a.start != b.start){
                return a.start - b.start;
            }
            return a.num - b.num;
        });
        
        PriorityQueue<Work> q = new PriorityQueue<>((a,b) -> { return a.start - b.start ;});
        
        for(int i = 0; i < jobs.length; i++){
            q.offer(new Work(jobs[i][0],jobs[i][1],i));
        }
        
        int currentTime = q.peek().start;
        
        List<Integer> results = new ArrayList<>();
        
        while(!pq.isEmpty() || !q.isEmpty()){
            while(!q.isEmpty() && (q.peek().start <= currentTime)){
                pq.offer(q.poll());
            }
            
            if(!pq.isEmpty()){
                Work current = pq.poll();
                currentTime = currentTime + current.time;
                results.add(currentTime - current.start);
            } else {
                currentTime = q.peek().start;
            }
            
        }
        
        for(int result : results){
            answer += result;
        }
        
        return answer / results.size();
    }
}