import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> dp = new ArrayList<>();
        
        if(N == number) return 1;
        
        for(int i = 0; i<=8; i++){
            dp.add(new HashSet<>());
        }
        
        dp.get(1).add(N);
        
        for(int i = 2; i <= 8; i++){
            Set<Integer> currentSet = dp.get(i);
            String s = "";
            for (int k = 0; k <i; k++){
                s += N;
            }
            
            currentSet.add(Integer.parseInt(s));
            
            for(int j = 1; j < i; j++){
                Set<Integer> left = dp.get(j);
                Set<Integer> right = dp.get(i-j);
                
                for (int leftNum : left){
                    for (int rightNum : right){
                        currentSet.add(leftNum + rightNum);
                        currentSet.add(leftNum - rightNum);
                        currentSet.add(leftNum * rightNum);
                        
                        if(rightNum !=0){
                            currentSet.add(leftNum / rightNum);
                        }
                        
                    }
                }
            }
            
            if(currentSet.contains(number))
                return i;
            
        }
        
        return -1;
    }
}

//최솟값이 8보다 크면 -1을 return <- 제약