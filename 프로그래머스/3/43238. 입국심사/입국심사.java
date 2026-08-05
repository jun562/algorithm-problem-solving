import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = 0;
        
        long left = 1;
        long right = (long) times[times.length-1] * n;
        
        while(left<=right){
            long mid = (left + right) / 2;
            long count = 0;
            
            for (int time : times){
                count += mid / time;
            }
            
            if(count >= n){
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}

//심사관마다 걸리는 시간 다름
//한 심사대 -> 한명만
//가장 앞 사람 -> 비어있는 심사대 or 더 빨리 끝나면 기다렸다가 심사
//모든 사람 심사 받는게 걸리는 시간 최소
//times 를 최솟값으로 sort 