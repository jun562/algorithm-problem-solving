import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);
        int left = 1;
        int right = distance;
        
        while(left<=right){
            int mid = (left + right) / 2;
            int prev = 0;
            int count = 0;
            
            for (int rock : rocks){
                if (rock-prev < mid){
                    count++;
                } else {
                    prev = rock;
                }
            }
            
            if (distance - prev < mid){
                count++;
            }
            
            if(count <= n){
                answer = mid; // count <= n 조건문에 count == n이 포함되어있기 때문
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
            
        }
        
        return answer;
    }
}

//거리의 최솟값을 mid로 가정