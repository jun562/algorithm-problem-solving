import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int w = brown + yellow;
        int x = 0;
        int y = 0;
        for(int i = 0; i <= 5000; i++){
            for(int j = 0; j <= 5000; j++){
                if(((i * j) == yellow) && (((i+2)*(j+2) - i*j) == brown) && (i>=j)){
                    x = i + 2;
                    y = j + 2;
                    break;
                }
            }
        }
        int[] answer = {x,y};
        return answer;
    }
}

//노랑 x, y  x * y = yellow
//갈색 (x + 2) * (y + 2) - x * y = brown