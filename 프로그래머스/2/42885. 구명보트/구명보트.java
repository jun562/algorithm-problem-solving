import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Deque<Integer> dq = new ArrayDeque<>();
        int answer = 0;
        Arrays.sort(people);
        
        for(int i = 0; i < people.length; i++){
            dq.offer(people[i]);
        }
        
        while(!dq.isEmpty()){
            int first = dq.peekFirst();
            int last = dq.peekLast();
            if((first + last) > limit){
                dq.pollLast();
                answer++;
            } else {
                dq.pollFirst();
                dq.pollLast();
                answer++;
            }
        }
       
        return answer;
        
    }
}

//보트 최대 2명, 무게 제한
//최대한 적게 -> 최대한 무게 제한을 채워서 보내야함
//가장 적은 값 + 가장 큰 값 < 무게 제한 
//이후 반복