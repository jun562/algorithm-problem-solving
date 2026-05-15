import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.offer(i);
        }
        
        while(pq.peek() < K && (!pq.isEmpty())){
            if(pq.size()==1){
                answer = -1;
                break;
            }
            int fq = pq.poll();
            int sq = pq.poll();
            int nq = fq + 2 * sq;
            pq.offer(nq);
            answer++;
        }
        return answer;
    }
}

//모든 음식 스코빌 지수 k이상
//가장 낮은 두개 음식 섞음  -> 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2) -> 새로운 음식 (2개에서 1개로 줄음)
// 최소 횟수
