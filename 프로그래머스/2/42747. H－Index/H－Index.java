import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0; //정답
        int n = citations.length;
        int[] result = new int[citations.length];
        
        for(int i = 0; i< citations.length; i++){
            result[i] = citations[i];
        } //초기화 꼭 해주기
        Arrays.sort(result);
        
        int count = 0;
        int h = 0;
        while(true){
            for(int i = 0; i < result.length; i++){
                if(result[i] >= h){
                    count ++;
                }
            }
            if(count >= h){
                count = 0;
                h++;
            } else {
                answer = h - 1;
                break;
            }
        }
        
        return answer;
    }
}
//발표 n 편중, h번 이상 인용된 논문이 h편 이상, 나머지 논문(n-h)이 h번 이하 인용되었다면 h의 최댓값 