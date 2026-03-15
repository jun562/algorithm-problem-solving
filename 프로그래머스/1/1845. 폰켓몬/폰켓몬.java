import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        int kind = set.size();
        int answer = 0;
        if (kind < nums.length / 2){
            answer = kind; 
        } else {
            answer = nums.length / 2 ;
        }
        return answer;
    }
}