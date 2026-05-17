import java.util.*;

class Solution {
    static boolean[] visited; // 숫자 카드의 사용 여부 체크
    static String[] arr;      // 분리된 숫자 카드들을 담을 배열
    static Set<Integer> nums = new HashSet<>(); // 중복 없는 숫자들의 집합
    
    public int solution(String numbers) {
        int answer = 0;
        
        arr = numbers.split(""); 
        visited = new boolean[arr.length];
        
        for (int i = 1; i <= arr.length; i++) {
            backtrack(i, 0, "");
        }
 
        for (int num : nums) {
            if (num < 2) {
                continue;
            }
            
            boolean isPrime = true;
            
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
        
            if (isPrime) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void backtrack(int targetLength, int depth, String currentStr) {
        if (depth == targetLength) {
            nums.add(Integer.parseInt(currentStr)); 
            return; 
        }
        
        for (int j = 0; j < arr.length; j++) {
            if (!visited[j]) {
                visited[j] = true; 
                backtrack(targetLength, depth + 1, currentStr + arr[j]);
                visited[j] = false; 
            }
        }
    }
}