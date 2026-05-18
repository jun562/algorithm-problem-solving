import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] cloth = new int[n+2]; //양끝 비우기
        for(int i = 1; i <= n; i++){
            cloth[i] = 1;
            for(int j = 0; j < lost.length; j++){
                if(i== lost[j]){
                    cloth[i] --;
                }
            }
            for(int k = 0; k < reserve.length; k++){
                if(i == reserve[k]){
                    cloth[i] ++;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(cloth[i] == 0 && cloth[i-1] == 2){
                cloth[i]++;
                cloth[i-1]--;
            }
            if(cloth[i] == 0 && cloth[i+1] == 2){
                cloth[i]++;
                cloth[i+1]--;
            }
        }
        
        for(int i = 0; i < cloth.length; i++){
            if(cloth[i] >= 1){
                answer++;
            }
        }
        
        return answer;
    }
}
//n명 전체, lost 잃어버림 , reverse 여벌
// lost 번호 앞뒤 사람이 줄 수 있음 , reverse 한번 여벌 , reverse가 잃어 버릴 수 있음
