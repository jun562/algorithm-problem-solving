import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        List<String> s = new ArrayList<>(Arrays.asList(words));
        if(!s.contains(target)){
            return 0;
        }
        
        boolean[] visited = new boolean[words.length];
        Queue<String> q = new ArrayDeque<>();
        
        q.offer(begin);
        int step = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                String cur = q.poll();
                
                if(cur.equals(target)){
                    return step;
                }
                
                for(int j = 0; j<words.length; j++){
                    if(!visited[j] && check(cur,words[j])){
                        visited[j] = true;
                        q.offer(words[j]);
                    }
                }
            }
            step++;
        }
        return 0;
    }
    
    public static boolean check(String a, String b){
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                count ++;
            }
        }
        
        if(count == a.length()-1){
            return true;
        }
        
        return false;
    }
}

//두 단어 / 단어 집합
//begin -> target으로 변환
//1. 한번에 한 개의 알파벳만 
//2. words에 있는 단어로만 변환
//최소 몇 단계
//변환할 수 없는 경우 0 return

//첫번째 접근 -> 비효율적, 이미 words에 후보군들이 주어짐
//ex)
//1. hit -> cit or hog or hig 3
//2. cit -> cot or cig 2
//3. cot -> cog  1
//3글자 -> 최대 3!

//10글자 -> 10!
//list의 contains -> o(N) -> 최대 50개
//10! x 50 = 3628800 x 50 = 1.5억

//두번째 접근 -> bfs 
