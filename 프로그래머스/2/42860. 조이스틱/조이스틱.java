import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        
        int move = length - 1;
        
        for(int i = 0; i < length; i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z'-name.charAt(i)+1);
            
            int next = i + 1;
            while(next< length && name.charAt(next) == 'A'){
                next++;
            }
            
            move = Math.min(move, i * 2 + (length - next));
            move = Math.min(move, (length-next) * 2 + i);
        }
        
        return answer + move;
    }
}

// 맨 처음엔 A로만 
// ▲ - 다음 알파벳
// ▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
// ◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
// ▶ - 커서를 오른쪽으로 이동 (마지막 위치에서 오른쪽으로 이동하면 첫 번째 문자에 커서)
// 조작 횟수 최솟값
// 1. 상하
// A-Z 개수 - 26개 
// A-Z 차이 13이하여야 그대로, 14부터는 뒤로가는게 최소 
// 2. 좌우
// AZZAA