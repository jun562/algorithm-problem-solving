import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a,b) -> a[1] - b[1]);
        int answer = 1;
        int c = routes[0][1];
        
        for(int i = 1; i < routes.length; i++){
            if(routes[i][0] > c){
                answer ++;
                c = routes[i][1];
            }
        }
        return answer;
    }
}


//단속 카메라 한번은 필수
//카메라 최소값
// -15 -13 -5 -3